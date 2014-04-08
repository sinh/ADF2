/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session03.collection.map;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class Dictionary_TreeMap {
    public static void main(String[] args) {
        TreeMap dic = new TreeMap();
        dic.put("red", "Mầu đỏ");
        dic.put("green", "Mầu xanh lá cây");
        dic.put("blue", "Mầu xanh da trời");
        dic.put("white", "Mầu trắng");
        dic.put("black", "Mầu đen");
        System.out.println(dic);
        
        //Nhập vào một từ để tra từ điển
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập vào một từ: ");
        String word = kb.nextLine();

        Object mean = dic.get(word.toLowerCase());
        if (mean == null) {
            System.out.println("Không có từ này trong từ điển");
        } else {
            System.out.println("Nghĩa của từ: " + mean);
        }
    }
}
