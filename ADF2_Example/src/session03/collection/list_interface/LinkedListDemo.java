/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.list_interface;

import java.util.LinkedList;

/**
 *
 * @author sinhnx
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkList = new LinkedList();
        linkList.addFirst(1);
        linkList.addFirst(2);
        
        linkList.push("Hello");
        linkList.push("World");
        
        for (Object obj : linkList) {
            System.out.println(obj);
        }
    }
   
}
