/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session08.multithreading_concurency.producer_consumer;

/**
 *
 * @author sinhnx <sinhnx@fpt.aptech.ac.vn>
 */
public class Consumer implements Runnable {

    private final String name;
    private final Broker broker;

    public Consumer(String name, Broker broker) {
        this.name = name;
        this.broker = broker;
    }

    @Override
    public void run() {
        try {
            Integer data = broker.get();

            while (broker.continueProducing || data != null) {
                Thread.sleep(1000);
                System.out.println("Consumer " + this.name + " processed data from broker: " + data);
                data = broker.get();
            }

            System.out.println("Comsumer " + this.name + " finished its job; terminating.");
        } catch (InterruptedException ex) {
        }
    }
}
