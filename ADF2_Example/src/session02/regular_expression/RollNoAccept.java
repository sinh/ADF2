/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class RollNoAccept {

    public static void main(String[] args) {
        System.out.print("RollNo: ");
        String rollNo = new Scanner(System.in).nextLine();

        //Mau xau
        Pattern p = Pattern.compile("^[A-Z]\\d{5}$", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(rollNo);
        if (m.find()) {
            System.out.println("RollNo is valid!");
        } else {
            System.out.println("RollNo is invalid!");
        }
    }
}
