/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01.assertion;

/**
 *
 * @author SinhNX <sinhnx@fpt.edu.vn>
 */
public class AssertionDemo {

    public static void main(String[] args) {
        int a = 16;
        assert a > 18 : "So phai lon hon 18";
        System.out.println(a);
    }
}
