/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session08.multithreading_concurency;

/**
 *
 * @author sinhnx
 */
public class SynchronizedThreadDemo extends Thread {

    static String msg[] = {"This", "is", "a", "synchronized", "variable"};

    SynchronizedThreadDemo(String threadname) {
        super(threadname);
    }

    @Override
    public void run() {
        display(getName());
    }

    public synchronized void display(String threadN) {
        for (int i = 0; i <= 4; i++) {
            System.out.println(threadN + msg[i]);
        }
        try {
            SynchronizedThreadDemo.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        SynchronizedThreadDemo t1 = new SynchronizedThreadDemo("Thread One: ");
        t1.start();
        SynchronizedThreadDemo t2 = new SynchronizedThreadDemo("Thread Two: ");
        t2.start();
    }
}
