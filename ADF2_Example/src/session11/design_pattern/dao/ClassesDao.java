/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11.design_pattern.dao;

import java.util.List;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public interface ClassesDao {

    List<Classes> getAllClasses();
    Classes getClasses(String className);
}
