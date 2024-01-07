
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;

    conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/umeshnager", "root", "NIKHIL2005@sutar");
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

