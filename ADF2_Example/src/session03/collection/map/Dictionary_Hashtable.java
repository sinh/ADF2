/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session03.collection.map;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sinhnx
 */
public class Dictionary_Hashtable {

    public static void main(String[] args) {
        Hashtable dic = new Hashtable();
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

        //Lấy toàn bộ keys (là một HashSet) trong Hashtable
        Set keys = dic.keySet();
        for (Object key : keys) {
            //So sánh từ nhập vào và key xem giống nhau không (không phân biệt hoa thường)
            if (word.equalsIgnoreCase(key.toString())) {
                //Nếu thấy thì hiển thị nghĩa
                System.out.println("Nghĩa của từ: " + dic.get(key));
            }
        }
    }
}
