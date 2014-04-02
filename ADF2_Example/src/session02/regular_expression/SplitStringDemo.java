/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session02.regular_expression;

/**
 *
 * @author sinhnx
 */
public class SplitStringDemo {
    public static void main(String[] args) {
        String str = "Hello;123;World";
        String [] a = str.split(";");
        for (String s : a) {
            System.out.println(s);
        }
    }
}
