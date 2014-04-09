/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.file.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class UsingByteArray_BufferedStream {

    public static void main(String[] args) {
        long start = new Date().getTime();
        try (//lay file (ca duong dan) can copy
                FileInputStream fis = new FileInputStream(UsingInt.SOURCE_FILE);
                BufferedInputStream bis = new BufferedInputStream(fis);
                //Tao ra file dich de copy
                FileOutputStream fos = new FileOutputStream(UsingInt.DESTINATION_FILE);
                BufferedOutputStream bos = new BufferedOutputStream(fos);) {
            int len;
            byte temp[] = new byte[512];
            while ((len = bis.read(temp)) > 0) {
                bos.write(temp, 0, len);
            }
        } catch (IOException ex) {
            System.out.println("Copy Error!");
        }
        long stop = new Date().getTime();
        System.out.println("Thời gian copy: " + (stop - start) + "ms");
    }
}
