/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session07.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class InheritThreadTest {
    public static void main(String[] args) {
        System.out.println("START PROGRAM");
        InheritThread t = new InheritThread();
        t.start();
        
        //Dừng Thread main trong 3 giây
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(InheritThreadTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("STOP PROGRAM");
    }
}
