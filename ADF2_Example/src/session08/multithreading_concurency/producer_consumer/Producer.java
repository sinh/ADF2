/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session08.multithreading_concurency.producer_consumer;

/**
 *
 * @author sinhnx <sinhnx@fpt.aptech.ac.vn>
 */
public class Producer implements Runnable {

    private final Broker broker;

    public Producer(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        try {
            for (Integer i = 1; i < 5 + 1; ++i) {
                System.out.println("Producer produced: " + i);
                Thread.sleep(100);
                broker.put(i);
            }

            this.broker.continueProducing = Boolean.FALSE;
            System.out.println("Producer finished its job; terminating.");
        } catch (InterruptedException ex) {
        }

    }
}
