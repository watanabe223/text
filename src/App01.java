import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App01 {
    public static void main(String[] args) {
        try {
            FileReader fr= new FileReader("F:\\aa.txt");
            fr.read();
            Connection conn = DriverManager.getConnection("dddd");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
