/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.java_lang_package;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sinhnx
 */
public class RuntimeDemo {

    public static void main(String[] args) {
        try {
            /* Chạy trên Windows */
            Runtime.getRuntime().exec("cal");
            
            /* Chạy trên MacOSX */
            //Runtime.getRuntime().exec("open -a Calculator");
        } catch (IOException ex) {
            Logger.getLogger(RuntimeDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
