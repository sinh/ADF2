/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session05.file.data_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class DataStream {
    public static void main(String[] args) {
        /*try(DataOutputStream dOut = new DataOutputStream(new FileOutputStream("data.dat"));) {
            dOut.writeInt(12);
            dOut.writeUTF("Hello Data Stream!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        try(DataInputStream dIn = new DataInputStream(new FileInputStream("data.dat"));) {
            int i = dIn.readInt();
            String str = dIn.readUTF();
            System.out.println("Integer: " + i);
            System.out.println("String: " + str);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
