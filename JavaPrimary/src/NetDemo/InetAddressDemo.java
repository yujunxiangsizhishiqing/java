package NetDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        System.out.println("-------");

        InetAddress inetAddress = InetAddress.getByName("wangxu");
        System.out.println(inetAddress);
    }
}
