/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session12.internationlization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Language {
    public static void main(String[] args) {
        Locale locale = new Locale("vi", "VN");
        display(locale);
        //display(Locale.US);
    }
    
    private static void display(Locale locale){
        ResourceBundle bundle = ResourceBundle.getBundle("session12.internationlization.language", locale);
        System.out.println("1. " + bundle.getString("add"));
        System.out.println("2. " + bundle.getString("edit"));
        System.out.println("3. " + bundle.getString("delete"));
        System.out.println("4. " + bundle.getString("search"));
        System.out.println("5. " + bundle.getString("sort"));
    }
}
