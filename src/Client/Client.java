package Client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("145.89.207.253", 4711);
//        145.89.154.132
        OutputStream os = s.getOutputStream();
        os.write("hello\n".getBytes());
        s.close();
    }
}
