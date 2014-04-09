/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session05.file.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class UsingInt_BufferedStream {
    public static void main(String[] args) {
        long time1 = new Date().getTime();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //lay file (ca duong dan) can copy
            fis = new FileInputStream(UsingInt.SOURCE_FILE);
            bis = new BufferedInputStream(fis);

            //Tao ra file dich de copy
            fos = new FileOutputStream(UsingInt.DESTINATION_FILE);
            bos = new BufferedOutputStream(fos);

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Source File not exists!");
        } catch (IOException ex) {
        } finally {
            try {
                //Đóng 4 đối tượng file
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
            }
        }
        long time2 = new Date().getTime();
        System.out.println("Copy time: " + (time2-time1));
    }
}
