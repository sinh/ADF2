/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session03.collection.other;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class ArraysDemo {

    public static void main(String[] args) {
        int a[] = {1, 7, 3, 4, 8, 9, 2, 5};
        //Sử dụng Arrays để sắp xếp:
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.print("Nhập vào một số nguyên: ");
        int search = new Scanner(System.in).nextInt();
        //Sử dụng phương thức tìm kiếm nhị phân
        int index = Arrays.binarySearch(a, search);
        System.out.println("Tìm thấy " + search + " ở vị trí thứ " + index);
    }
}
