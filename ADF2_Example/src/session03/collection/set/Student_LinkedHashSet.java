/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.set;

import java.util.LinkedHashSet;
import session03.collection.Student;

/**
 *
 * @author sinhnx
 */
public class Student_LinkedHashSet {
    public static void main(String[] args) {
        Student s1 = new Student("A12345", "Nguyen Van A");
        Student s2 = new Student("A12345", "Nguyen Van B");
        Student s3 = new Student("A12346", "Nguyen Van C");
        
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        
        for (Object obj : lhs) {
            System.out.println(obj);
        }
    }
}
