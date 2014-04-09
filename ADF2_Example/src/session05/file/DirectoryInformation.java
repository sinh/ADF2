/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.file;

import java.io.File;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class DirectoryInformation {

    public static void main(String[] args) {
        //Lấy thư mục của Netbeans Project
        File f = new File("./");
        if (f.isDirectory()) {
            //Lấy toàn bộ nội dung trong thư mục
            File[] subs = f.listFiles();
            //Hiển thị nội dung thư mục và file
            for (File file : subs) {
                System.out.println((file.isDirectory() ? "[Folder] " : "[File]   ") + file.getName());
            }
        }else{
            System.out.println(f.getAbsoluteFile() + " không phải là thư mục");
        }
    }
}
