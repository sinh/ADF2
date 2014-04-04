/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.list;

import java.util.Vector;
import java.util.Iterator;

/**
 *
 * @author sinhnx
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(5);
        vector.add("Hello");
        vector.add(12.7);
        vector.add("World");
        
        System.out.println("Duyệt ArrayList sử dụng theo vị trí");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
        
        System.out.println("\nDuyệt ArrayList theo iterator của Collection interface");
        Iterator it = vector.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("\nDuyệt ArrayList sử dụng vòng lặp for each");
        for (Object obj : vector) {
            System.out.println(obj);
        }
    }
}
