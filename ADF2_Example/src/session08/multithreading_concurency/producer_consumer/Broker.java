/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session08.multithreading_concurency.producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sinhnx <sinhnx@fpt.aptech.ac.vn>
 */
public class Broker {

    public ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);
    public Boolean continueProducing = Boolean.TRUE;

    public void put(Integer data) throws InterruptedException {
        this.queue.put(data);
    }

    public Integer get() throws InterruptedException {
        return this.queue.poll(1, TimeUnit.SECONDS);
    }
}
