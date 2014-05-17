/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session08.multithreading_concurency.producer_consumer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author sinhnx <sinhnx@fpt.aptech.ac.vn>
 */
public class TestProducerConsumer {

    public static void main(String[] args) {
        try {
            Broker broker = new Broker();

            ExecutorService threadPool = Executors.newFixedThreadPool(3);

            threadPool.execute(new Consumer("1", broker));
            threadPool.execute(new Consumer("2", broker));
            Future producerStatus = threadPool.submit(new Producer(broker));

            // this will wait for the producer to finish its execution.
            producerStatus.get();

            threadPool.shutdown();
        } catch (InterruptedException | ExecutionException e) {
        }
    }
}
