/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.file.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class UsingInt {

    public static final String SOURCE_FILE = "src/session05/file/copy/io.png";
    public static final String DESTINATION_FILE = "src/session05/file/copy/io_copy.png";

    public static void main(String[] args) {
        long start = new Date().getTime();
        try (FileInputStream fis = new FileInputStream(SOURCE_FILE);
                FileOutputStream fos = new FileOutputStream(DESTINATION_FILE);) {
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            System.out.println("Copy file thành công!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsingInt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsingInt.class.getName()).log(Level.SEVERE, null, ex);
        }
        long stop = new Date().getTime();
        System.out.println("Thời gian copy: " + (stop - start) + "ms");
    }
}
