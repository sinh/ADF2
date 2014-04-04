/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.set;

import java.util.HashSet;
import session03.collection.Student;

/**
 *
 * @author sinhnx
 */
public class Student_HashSet {
    public static void main(String[] args) {
        Student s1 = new Student("A12345", "Nguyen Van A");
        Student s2 = new Student("A12345", "Nguyen Van B");
        Student s3 = new Student("A12346", "Nguyen Van C");
        
        //Khai báo một Object HashSet
        HashSet hs = new HashSet();
        hs.add(s1);
        hs.add(s2);
        hs.add(s2);
        hs.add(s3);
        
        for (Object obj : hs) {
            System.out.println(obj);
        }
    }
}
