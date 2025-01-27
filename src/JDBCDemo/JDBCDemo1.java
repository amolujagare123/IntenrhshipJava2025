package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. loading Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2 . creating a connection
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/internship";

        Connection con = DriverManager.getConnection(url,username,password);

        // 3. creating a statement
        Statement st = con.createStatement();

        // 4. execute Query (DML Queries - Data Manipulation Language)
      //  String sql = "INSERT INTO student VALUES (11, 'veda', 'ENTC', 85)";
     //   String sql = "update student set branch='IT' where name = 'veda'";
        String sql = "delete from student where name = 'veda'";
        st.executeUpdate(sql);

        st.close();
        con.close();

    }


}
