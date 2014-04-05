/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session04.generic;

/**
 *
 * @author sinhnx
 * @param <T>
 */
public class GenericClass<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        GenericClass<String> stringGenericClass = new GenericClass<>();

        integerGenericClass.add(new Integer(10));
        stringGenericClass.add("Hello World");

        System.out.printf("Integer Value :%d\n\n", integerGenericClass.get());
        System.out.printf("String Value :%s\n", stringGenericClass.get());
    }
}
