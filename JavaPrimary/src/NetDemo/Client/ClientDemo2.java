package NetDemo.Client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo2 {

    public static void main(String[] args) throws IOException {
        //创建客户端的套接字
        Socket client = new Socket("127.0.0.1",1234);
        //--------------------向外进行输出---------------
        //获取输出流对象
        OutputStream outputStream = client.getOutputStream();
        //数据输出
        outputStream.write("ClientDemo2".getBytes());

        //--------------------接受服务端返回的消息--------
        //获取输出流对象
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        System.out.println("服务端的响应数据是：" + new String(buf,0,len));

        //关闭流操作
        outputStream.close();
        inputStream.close();
        client.close();

//        Socket client = new Socket("localhost",1234);
//        OutputStream outputStream = client.getOutputStream();
//        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//        dataOutputStream.writeUTF("this is client demo2 send ");
//
//        InputStream inputStream = client.getInputStream();
//        byte[] buf = new byte[1024];
//        int len = inputStream.read(buf);
//        System.out.println("client demo2 accept :"+new String(buf,0,len));
//
//        dataOutputStream.close();
//        outputStream.close();
//        inputStream.close();
//        client.close();
    }
}
