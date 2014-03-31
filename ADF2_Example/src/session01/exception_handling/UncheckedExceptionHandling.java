/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01.exception_handling;

/**
 *
 * @author sinhnx
 */
public class UncheckedExceptionHandling {

    public static void main(String[] args) {
        try {
            double d = 12 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Exception!");
        }
    }
}
