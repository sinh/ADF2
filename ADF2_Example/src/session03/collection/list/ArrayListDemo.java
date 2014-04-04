/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sinhnx
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(0, "Hello");
        arrayList.add(12.7);
        arrayList.add("World");
        
        System.out.println("Duyệt ArrayList sử dụng theo vị trí");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        
        System.out.println("\nDuyệt ArrayList theo iterator của Collection interface");
        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("\nDuyệt ArrayList sử dụng vòng lặp for each");
        for (Object obj : arrayList) {
            System.out.println(obj);
        }
    }
}
