package JDBC;

import java.sql.*;
import java.util.Scanner;

public class InsertData_Dynamically {
    public static void main(String[] args) throws Exception {

        String driver, url, username, password;

        driver   = "oracle.jdbc.driver.OracleDriver";        //In case of OracleSql
                    //"com.mysql.jdbc.Driver"                //In case of MySql
        url      = "jdbc:oracle:thin:@localhost:1521:xe";    //In case of OracleSql
                    //"jdbc:mysql://localhost:3306/sonoo"    //In case of MySql
        username = "username";
        password = "password";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the player");
        String i = sc.nextLine();
        System.out.println("Enter the Jersey number of the player");
        int j = sc.nextInt();

        sc.close();

        Class.forName(driver);

        Connection con = DriverManager.getConnection(url, username, password);

        String sql = "INSERT INTO Players VALUES (?,?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, i);
        ps.setInt(2, j);

        ps.executeUpdate();
        
    }
}
