import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public class SocketExample {

    public static void main(String[] args) {
        String serverName = "time.nist.gov";
        int port = 13;
        try (Socket socket = new Socket(serverName, port)) {
            // System.out.println("Server connected");

            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "ASCII");

            BufferedReader br = new BufferedReader(isr);

            String line;

            while((line = br.readLine()) != null){
                System.out.println(line);
            } 


        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Server not connected");

        }
    }
}
