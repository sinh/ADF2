/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11.design_pattern.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import session09.jdbc.DBConnector;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class ClassesDaoImpl implements ClassesDao {

    private final Connection con = DBConnector.getSqlServerConnection();

    @Override
    public List<Classes> getAllClasses() {
        List<Classes> lst = new ArrayList();
        try (Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM Classes")) {
            while (rs.next()) {
                lst.add(new Classes(rs.getString("ClassName"), rs.getString("Location")));
            }
        } catch (SQLException ex) {
            lst = null;
        }
        return lst;
    }

    @Override
    public Classes getClasses(String className) {
        Classes c = null;
        try (Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM Classes WHERE ClassName='" + className + "'")) {
            if (rs.next()) {
                c = new Classes(rs.getString("ClassName"), rs.getString("Location"));
            }
        } catch (SQLException ex) {
            c = null;
        }
        return c;
    }

}
