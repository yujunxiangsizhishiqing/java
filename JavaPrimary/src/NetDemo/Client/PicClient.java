package NetDemo.Client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class PicClient {

    public static void main(String[] args) throws IOException {
        //创建图片的输入流对象
        FileInputStream fileInputStream = new FileInputStream("D:/image/1.jpg");
        //创建Socket
        Socket client = new Socket("localhost",1234);

        //获取输出流对象
        OutputStream outputStream = client.getOutputStream();
        int temp = 0;
        for (;(temp = fileInputStream.read())!=-1;){
            outputStream.write(temp);
        }
        //添加流输出完成的标志
        client.shutdownOutput();

        //接受服务端的响应
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        System.out.println(new String(buf,0,len));
        client.shutdownInput();

        //关闭操作
        outputStream.close();
        client.close();
        fileInputStream.close();
    }
}
