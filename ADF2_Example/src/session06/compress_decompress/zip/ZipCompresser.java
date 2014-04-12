/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session06.compress_decompress.zip;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class ZipCompresser {

    public static void main(String[] args) {
        //Khai báo đường dẫn file của những file cần nén
        String fileList[] = {"build.xml", "manifest.mf", "Student.dat", "Student_HashSet.dat"};
        //Khai báo đường dẫn file nén
        String zipFile = "compress file.zip";

        //Gọi phương thức nén file
        if (compress(fileList, zipFile)) {
            System.out.println("Compress File Complete!");
        } else {
            System.out.println("Compress File Not Complete!");
        }

        //Khai báo thư mục để giải file nén
        String path = "./build";
        //Gọi phương thức giải nén file
        if (decompress(zipFile, path)) {
            System.out.println("Unzip Complete!");
        } else {
            System.out.println("Unzip Not Complete!");
        }
    }

    //phương thức nén file với đầu vào là mảng danh sách file cần nén, và file nén
    public static boolean compress(String[] fileList, String zipFile) {
        byte buf[] = new byte[2048];
        int len;
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));) {
            for (String fileName : fileList) {
                try (FileInputStream fis = new FileInputStream(fileName)) {
                    zos.putNextEntry(new ZipEntry(fileName));

                    while ((len = fis.read(buf)) > 0) {
                        zos.write(buf, 0, len);
                    }
                    zos.closeEntry();
                }
            }
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    //phương thức giải file nén với đầu vào là tên file nén và đường dẫn
    public static boolean decompress(String zipFileName, String pathUnzip) {
        try {
            ZipFile zipFile = new ZipFile(zipFileName);
            Enumeration enumeration = zipFile.entries();

            while (enumeration.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
                System.out.println("Unzipping: " + zipEntry.getName());
                try (BufferedInputStream bis = new BufferedInputStream(zipFile.getInputStream(zipEntry))) {
                    int size;
                    byte[] buffer = new byte[2048];
                    try (FileOutputStream fos = new FileOutputStream(pathUnzip + "/" + zipEntry.getName()); BufferedOutputStream bos = new BufferedOutputStream(fos, buffer.length)) {
                        while ((size = bis.read(buffer, 0, buffer.length)) != -1) {
                            bos.write(buffer, 0, size);
                        }
                        bos.flush();
                    }
                }
            }
        } catch (ZipException ze) {
            System.out.println("File [" + zipFileName + "] not exists.");
            return false;
        } catch (IOException e) {
            System.out.println("Path [" + pathUnzip + "] not exists");
            return false;
        }
        return true;
    }
}
