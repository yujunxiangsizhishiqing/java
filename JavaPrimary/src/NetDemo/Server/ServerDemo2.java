package NetDemo.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        //创建serversocket对象
        ServerSocket serverSocket = new ServerSocket(1234);
        //获取服务端的套接字对象
        Socket server = serverSocket.accept();

        //--------------------接受客户端的输入---------------------------
        //获取输入流对象
        InputStream inputStream = server.getInputStream();
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        System.out.println("客户端传输的数据 "+new String(buf,0,len));

        //---------------------返回客户端数据----------------------------------
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("ServerDemo2".getBytes());

        //关闭流
        outputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();

//        ServerSocket serverSocket = new ServerSocket(1234);
//        Socket server = serverSocket.accept();
//
//        InputStream inputStream = server.getInputStream();
//        byte[] buf = new byte[1024];
//        int len = inputStream.read(buf);
//        System.out.println("server demo2 accept :"+new String(buf,0,len));
//
//        OutputStream outputStream = server.getOutputStream();
//        outputStream.write("this is server demo2 send".getBytes());
//
//        outputStream.close();
//        inputStream.close();
//        server.close();
//        serverSocket.close();
    }
}
