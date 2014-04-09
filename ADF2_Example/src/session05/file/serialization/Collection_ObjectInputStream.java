/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.file.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Collection_ObjectInputStream {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student_HashSet.dat"))) {
            Object obj = ois.readObject();
            if (obj instanceof HashSet) {
                HashSet hs = (HashSet) obj;
                for (Object o : hs) {
                    System.out.println(o);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Student_ObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Student_ObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
