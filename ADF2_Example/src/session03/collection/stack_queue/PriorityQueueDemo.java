/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.stack_queue;

import java.util.PriorityQueue;
import session03.collection.Student;

/**
 *
 * @author sinhnx
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        
        pq.add(new Student("A33333", "Nguyen Van Z"));
        pq.add(new Student("A11111", "Nguyen Van E"));
        pq.add(new Student("A55555", "Nguyen Van X"));
        
        System.out.println(pq.poll());
        pq.add(new Student("A22222", "Nguyen Van B"));
        pq.add(new Student("A44444", "Nguyen Van A"));
        
        System.out.println(pq.poll());
        pq.add(new Student("A66666", "Nguyen Van F"));
        
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
