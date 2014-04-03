/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session02.java_lang_package;

/**
 *
 * @author sinhnx
 */
public class WrapperClassDemo {
    public static void main(String[] args) {
        Integer i = new Integer("123");
        //Sử dụng phương thức longValue() để đổi sang kiểu dữ liệu long
        long l = i.longValue();
        System.out.printf("i = %d, l = %d\n", i, l);
        
        //Sử dụng phương thức parseInt để chuyển một chuỗi về kiểu int
        int iValue = Integer.parseInt("12");
        System.out.println(iValue);
    }
}
