/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.java_lang_package;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class ClassDemo {

    public static void main(String[] args) {
        System.out.println("Accept a Class Name: ");
        String className = (new Scanner(System.in)).nextLine();
        try {
            Class c = Class.forName(className);
            System.out.println("Fields of " + className + ":");
            for (Field f : c.getDeclaredFields()) {
                System.out.println(f.toString());
            }
            System.out.println();
            System.out.println("Methods of " + className + ":");
            for (Method m : c.getDeclaredMethods()) {
                System.out.println(m.toString());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(className + " not available.");
        }
    }
}
