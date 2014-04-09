/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.file.character_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class FileReaderDemo {

    public static void main(String[] args) {
        String textFile = "src/session05/file/character_stream/FileReaderDemo.java";
        try (FileReader fr = new FileReader(textFile);
                BufferedReader br = new BufferedReader(fr);) {
            String str;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (IOException ex) {

        }
    }
}
