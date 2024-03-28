package Java_Practice.JDBC.MappingObjectsWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcApp {
    public static void main(String[] args) throws SQLException {
        Student st = new Student(1, "Viswas", "CS", 2024);
        insert(st);
    }

    public static void insert(Student st) throws SQLException{
        int roll = st.getRoll();
        String name = st.getName();
        String branch = st.getBranch();
        int yop = st.getYOP();
        
        String url;
        String username;
        String password;

        String sql = "INSERT INTO Student values(?,?,?,?)";

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, roll);
        ps.setString(2, name);
        ps.setString(3, branch);
        ps.setInt(4, yop);

        ps.executeUpdate();
    }
}
