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
public class InheritThread extends Thread {

    @Override
    public void run() {
        for(int i=1; i<= 10 ; i++){
            System.out.println(i);
            //Sau mỗi lần hiển thị dừng lại 1 giây
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(InheritThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
