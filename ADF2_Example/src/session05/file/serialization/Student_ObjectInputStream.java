/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session05.file.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import session03.collection.Student;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Student_ObjectInputStream {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.dat"));){
            Object obj = ois.readObject();
            if(obj instanceof Student){
                Student s = (Student)obj;
                System.out.println("RollNo: " + s.getRollNo());
                System.out.println("Full Name: " + s.getName());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student_ObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student_ObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student_ObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
