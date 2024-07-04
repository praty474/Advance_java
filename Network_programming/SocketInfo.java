// import java.net.InetSocketAddress;
// import java.net.Socket;
// import java.net.SocketAddress;
import java.net.*;

public class SocketInfo {
    public static void main(String[] args) {
        try (Socket socket = new Socket()) {
            SocketAddress address = new InetSocketAddress("www.example.com", 80);
            socket.connect(address);
            socket.setSoTimeout(100);
            socket.setOOBInline(true);
            socket.getKeepAlive();

            System.out.println("Address " + socket.getInetAddress());
            System.out.println("port " + socket.getPort());
            System.out.println("local address " + socket.getLocalAddress());
            System.out.println("local port " + socket.getLocalPort());


        } catch (Exception e) {
           
        }
        System.out.println("With Proxy");
        try {
            Socket socket = new Socket(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("213.217.30.69", 3128)));
            socket.connect(new InetSocketAddress("www.example.com",80));
            
            System.out.println("Address " + socket.getInetAddress());
            System.out.println("port " + socket.getPort());
            System.out.println("local address " + socket.getLocalAddress());
            System.out.println("local port " + socket.getLocalPort());


            socket.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
