/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.set;

import java.util.TreeSet;
import session03.collection.Student;

/**
 *
 * @author sinhnx
 */
public class Student_TreeSet {
    public static void main(String[] args) {
        Student s1 = new Student("A12345", "Nguyen Van A");
        Student s2 = new Student("A12345", "Nguyen Van B");
        Student s3 = new Student("A12346", "Nguyen Van C");
        
        //Khai báo một Object HashSet
        TreeSet ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s2);
        ts.add(s3);
        ts.add(new Student("A12344", "Nguyen Thi B"));
        
        for (Object obj : ts) {
            System.out.println(obj);
        }
    }
}
