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

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class UsingByteArray {

    public static void main(String[] args) {
        long start = new Date().getTime();
        try (//lay file (ca duong dan) can copy
                FileInputStream fis = new FileInputStream(UsingInt.SOURCE_FILE);
                //Tao ra file dich de copy
                FileOutputStream fos = new FileOutputStream(UsingInt.DESTINATION_FILE);) {

            int len;
            byte temp[] = new byte[256];
            while ((len = fis.read(temp)) > 0) {
                fos.write(temp, 0, len);
            }
        } catch (IOException ex) {
            System.out.println("Copy Error!");
        }
        long stop = new Date().getTime();
        System.out.println("Thời gian copy: " + (stop - start) + "ms");
    }
}
