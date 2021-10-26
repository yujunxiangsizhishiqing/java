package NetDemo.Server;

import NetDemo.Client.User;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(1234);
        for (;;){
            Socket server = serverSocket.accept();
            //获取输入流对象
            InputStream inputStream = server.getInputStream();
            //需要使用ObjectInputStream对象
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            User user = (User) objectInputStream.readObject();
            String str = "";
            if ("wangxu".equals(user.getName())&&"yj950627".equals(user.getPassword())){
                System.out.println("user login succ");
                str = "login successful";
            }else{
                str = "login failed";
            }
            server.shutdownInput();

            DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
            dataOutputStream.writeUTF(str);
            server.shutdownOutput();

            dataOutputStream.close();
            objectInputStream.close();
            inputStream.close();
            server.close();
        }
        //serverSocket.close();
    }


}

