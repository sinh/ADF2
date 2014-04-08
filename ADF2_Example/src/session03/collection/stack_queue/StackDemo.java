/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.stack_queue;

import java.util.Stack;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Hello");
        s.push(1);
        s.push("World");
        s.push(10);
        
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
