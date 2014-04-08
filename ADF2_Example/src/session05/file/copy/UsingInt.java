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
public class UsingInt {

    public static final String SOURCE_FILE = "";
    public static final String DESTINATION_FILE = "";

    public static void main(String[] args) {
        long time1 = new Date().getTime();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //lay file (ca duong dan) can copy
            fis = new FileInputStream(SOURCE_FILE);

            //Tao ra file dich de copy
            fos = new FileOutputStream(DESTINATION_FILE);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Source File not exists!");
        } catch (IOException ex) {
        } finally {
            try {
                //Đóng 2 đối tượng file
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
        System.out.println("Copy time: " + (time2 - time1));
    }
}
