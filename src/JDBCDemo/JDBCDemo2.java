package JDBCDemo;

import java.sql.*;

public class JDBCDemo2 {

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

        // 4. execute Query (DDL Queries - Data Definition Language)
        String sql = "select * from student where branch='IT'";
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print( rs.getInt("rno") +"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }



        st.close();
        con.close();

    }


}
