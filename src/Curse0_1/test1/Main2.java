package Curse0_1.test1;

import java.math.BigDecimal;

/**
 * @author Created by knyazev.v on 21.04.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        byte bt = 127;
        System.out.println(Byte.MAX_VALUE);

        short sh = 32767;
        System.out.println(Short.MAX_VALUE);

        int i = 2147483647; // По умолчанию
        System.out.println(Integer.MAX_VALUE);

        long l = 9223372036854775807L;
        System.out.println(l);

        char ch = 23213;// порядковый номер символа
        System.out.println(ch);

        String s = "Hello";
        System.out.println(s);

        boolean b = true;
        System.out.println(b);
        System.out.println(BigDecimal.ZERO);

        double d = 12.3;
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);

        float f =  12.4f;
        System.out.println(Float.BYTES);

        Void v = null;
    }
}
