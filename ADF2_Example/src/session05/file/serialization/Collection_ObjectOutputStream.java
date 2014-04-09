/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.file.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import session03.collection.Student;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Collection_ObjectOutputStream {

    public static void main(String[] args) {
        Student s1 = new Student("A12345", "Nguyen Van A");
        Student s2 = new Student("A12346", "Nguyen Van B");
        Student s3 = new Student("A12347", "Nguyen Van C");

        //Khai báo một Object HashSet
        HashSet hs = new HashSet();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student_HashSet.dat"))) {
            oos.writeObject(hs);
            System.out.println("Write HashSet to file complete");
        } catch (IOException ex) {
            Logger.getLogger(Student_ObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
