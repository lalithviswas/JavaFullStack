package JDBC;

import java.sql.*;

public class FetchData {
    public static void main(String[] args) throws Exception {

        String driver, url, username, password;

        driver   = "oracle.jdbc.driver.OracleDriver";        //In case of OracleSql
                    //"com.mysql.jdbc.Driver"                //In case of MySql
        url      = "jdbc:oracle:thin:@localhost:1521:xe";    //In case of OracleSql
                    //"jdbc:mysql://localhost:3306/sonoo"    //In case of MySql
        username = "username";
        password = "password";

        Class.forName(driver);

        Connection con = DriverManager.getConnection(url, username, password);

        String sql = "SELECT * FROM table_name"; // Eg. SELECT * FROM  Players;

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " "  + rs.getString(2));            
        }
        
    }
}
