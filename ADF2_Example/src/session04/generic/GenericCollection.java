/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session04.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class GenericCollection {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("zyx");
        System.out.println(list);

    }
}
