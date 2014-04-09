/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05.file.character_stream;

import java.io.PrintWriter;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class PrintWriterDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Hello PrintWriter!");
        pw.flush();
        char[] charArray = {'\n', 'c', 'h', 'a', 'r', ' ', 'a', 'r', 'r', 'a', 'y', '\n'};
        pw.write(charArray);
        pw.flush();
    }
}
