package NetDemo.Server;

import NetDemo.Client.User;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class LoginThread implements Runnable{
    private Socket socket;

    public LoginThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        ObjectInputStream objectInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            Object obj = objectInputStream.readObject();
            User user = (User) obj;
            String str = "";
            if ("wangxu".equals(user.getName())&&"yj950627".equals(user.getPassword())){
                System.out.println("user login succ");
                str = "login successful";
            }else{
                str = "login failed";
            }
            socket.shutdownInput();

            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(str);
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                dataOutputStream.close();
                objectInputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
