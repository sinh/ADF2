/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session09.jdbc.type1;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SinhNX
 */
public class JDBC_ODBC_Bridge {
    public static void main(String[] args) {
        String sql = "SELECT ClassName, Location FROM Classes ORDER BY Location";
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            
            //Phai thiet lap mot ODBC ten la type1 trong DataSource (ODBC)
            Connection cn = DriverManager.getConnection("jdbc:odbc:type1");
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                System.out.printf("%-10s%s\n", rs.getString("ClassName"), rs.getString("Location"));
            }
            //Close Connection
            cn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JDBC_ODBC_Bridge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
