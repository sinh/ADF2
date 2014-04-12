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
public class ImplementRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
    
}
