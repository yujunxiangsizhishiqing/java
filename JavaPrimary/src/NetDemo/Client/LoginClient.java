package NetDemo.Client;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginClient {

    public static void main(String[] args) throws IOException {
        Socket client  = new Socket("localhost",1234);

        OutputStream outputStream = client.getOutputStream();
        //完成登录功能，需要传输一个user对象
        User user = getUser();
        //传输对象需要ObjectOutputStream
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        //调用shutdown方法告诉对对方传输完成
        client.shutdownOutput();

        //接受响应
        DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
        String str = dataInputStream.readUTF();
        System.out.println(str);
        //关闭流操作
        dataInputStream.close();
        objectOutputStream.close();
        outputStream.close();
        client.close();
    }

    public static User getUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.nextLine();
        System.out.println("请输入用户密码：");
        String password = scanner.nextLine();

        return new User(name,password);
    }
}
