package NetDemo.Client;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        //创建udp通信的socket
        DatagramSocket datagramSocket = new DatagramSocket(1234);
        //从控制台读取数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入信息:");
        String str = scanner.nextLine();
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(),str.getBytes().length,InetAddress.getByName("localhost"),1111);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
