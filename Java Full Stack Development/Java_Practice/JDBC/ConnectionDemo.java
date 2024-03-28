// 4 steps we follow:

// 1. Import sql package
// 2. Load the Driver
// 3. Establish the connection
// 4. Create a Statement


package JDBC;

//Step1
import java.sql.*;


public class ConnectionDemo{
    public static void main(String[] args) throws Exception {

        //Defining the variables:
        String driver, url, username, password;

        driver   = "oracle.jdbc.driver.OracleDriver";        //In case of OracleSql
                    //"com.mysql.jdbc.Driver"                //In case of MySql
        url      = "jdbc:oracle:thin:@localhost:1521:xe";    //In case of OracleSql
                    //"jdbc:mysql://localhost:3306/sonoo"    //In case of MySql
        username = "username";
        password = "password";

        //Step2
        Class.forName(driver);

        //Step3
        Connection con = DriverManager.getConnection(url, username, password);
        //System.out.println("Connection Successful");

        //Step4
        String sql = "CREATE TABLE table_name(with the necessary fields)"; // Eg. CREATE TABLE Players(Name VARCHAR(20), JerseyNumber INT)
        Statement st = con.createStatement();
        st.execute(sql);      //st.executeUpdate() if we are Inserting or Updating Values
        
        //System.out.println("Query has executed successfully");
    
    }
}
