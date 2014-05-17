/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session12.internationlization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author sinhnx <sinhnx@fpt.edu.vn>
 */
public class DateFormatDemo {

    public static void main(String[] args) {
        Locale locale = new Locale("vi", "VN");
        DateFormat df = DateFormat.getDateInstance(0, locale);
        System.out.println(df.format(new Date()));
        df = DateFormat.getDateInstance(1, locale);
        System.out.println(df.format(new Date()));
        df = DateFormat.getDateInstance(2, locale);
        System.out.println(df.format(new Date()));
        df = DateFormat.getDateInstance(3, locale);
        System.out.println(df.format(new Date()));
    }
}
