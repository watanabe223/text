import java.io.IOException;
import java.net.ServerSocket;

public class App02 {
    public static void main(String[] args) {
        int port = 1688;
        boolean flag = true;
        while (flag) {
            try {
                ServerSocket ss = new ServerSocket(port);
                flag = false;
                System.out.println("KKKK" + port);
                System.out.println("AAA");
            } catch (IOException e) {
                port = port + 1;
                e.printStackTrace();
            } finally{

            }
            System.out.println("ssss");
        }
    }
}
