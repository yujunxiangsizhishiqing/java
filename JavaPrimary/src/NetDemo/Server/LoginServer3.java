package NetDemo.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer3 {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        for (;;){
            Socket server = serverSocket.accept();
            LoginThread loginThread = new LoginThread(server);
            new Thread(loginThread).start();
        }
        //serverSocket.close();
    }
}
