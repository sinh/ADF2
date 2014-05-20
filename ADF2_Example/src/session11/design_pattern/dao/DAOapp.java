/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session11.design_pattern.dao;

import java.util.Scanner;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class DAOapp {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input Class Name: ");
        String cName = kb.nextLine();
        
        ClassesDao cDao = new ClassesDaoImpl();
        
        Classes c = cDao.getClasses(cName);
        if (c == null) {
            System.out.println("Not exists " + cName);
        } else {
            System.out.println("Class Name: " + c.getClassName());
            System.out.println("Location: " + c.getLocation());
        }
    }
}
