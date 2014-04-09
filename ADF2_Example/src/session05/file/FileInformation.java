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
public class FileInformation {
    public static void main(String[] args) {
        File f = new File("src/session05/file/FileInformation.java");
        if(f.exists()){
            System.out.println("File tồn tại với các thông số sau:");
            System.out.println("Đường dẫn: " + f.getPath());
            System.out.println("Đường dẫn tuyệt đối: " + f.getAbsolutePath());
            System.out.println("Tên file: " + f.getName());
            System.out.println("Có khả năng chạy: " + f.canExecute());
            System.out.println("Có khả năng đọc: " + f.canRead());
            System.out.println("Có khả năng thay đổi: " + f.canWrite());
        }else{
            System.out.println("File không tồn tại.");
        }
    }
}
