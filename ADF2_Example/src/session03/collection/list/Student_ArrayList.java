/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.list;

import session03.collection.Student;
import java.util.ArrayList;

/**
 *
 * @author sinhnx
 */
public class Student_ArrayList {
    public static void main(String[] args) {
        Student s1 = new Student("A12345", "Nguyen Van A");
        Student s2 = new Student("A12345", "Nguyen Van B");
        Student s3 = new Student("A12346", "Nguyen Van C");
        
        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s2);
        list.add(s3);
        
        for (Object obj : list) {
            System.out.println(obj);
        }
        /*
        list.remove(new Student("A12346", "123"));
        System.out.println("\nAfter remove:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        */
    }
}
