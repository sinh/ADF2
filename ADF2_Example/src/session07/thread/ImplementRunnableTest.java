/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session07.thread;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class ImplementRunnableTest {
    public static void main(String[] args) {
        System.out.println("Main Thread Start");
        
        ImplementRunnable runnable = new ImplementRunnable();
        Thread t = new Thread(runnable);
        t.start();
        
        System.out.println("Main Thread Stop");
    }
}
