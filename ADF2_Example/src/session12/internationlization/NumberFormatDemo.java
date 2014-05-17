/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session12.internationlization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author sinhnx <sinhnx@fpt.edu.vn>
 */
public class NumberFormatDemo {

    public static void main(String[] args) {
        double d = 123456.789;
        Locale locale = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        DecimalFormat df = (DecimalFormat)nf;
        df.applyPattern("###,###,###.##");
        
        System.out.println(df.format(d));
        
        nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(d));
        
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(d));
        
        System.out.println(NumberFormat.getPercentInstance(locale).format(0.3));
    }
}
