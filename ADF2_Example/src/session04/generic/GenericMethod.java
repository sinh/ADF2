/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session04.generic;

/**
 *
 * @author sinhnx
 */
public class GenericMethod {

    public static <T> void show(T[] args) {
        for (T t : args) {
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains:");
        show(intArray); // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        show(doubleArray); // pass a Double array

        System.out.println("\nArray characterArray contains:");
        show(charArray); // pass a Character array
    }
}
