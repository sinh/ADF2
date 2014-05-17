/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.file.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import session03.collection.Student;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Student_ObjectOutputStream {

    public static void main(String[] args) {
        Student s = new Student("A12345", "Nguyen Van B");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.dat"));){
            oos.writeObject(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student_ObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student_ObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
