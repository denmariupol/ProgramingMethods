package Chapter_7_Strings.Examples.DateTime_Format;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        Calendar cal = Calendar.getInstance();
        f.format("%tr",cal);
        System.out.println(f);

        f = new Formatter();
        f.format("%tc",cal);
        System.out.println(f);

        f = new Formatter();
        f.format("%tH:%tM",cal,cal);
        System.out.println(f);

        f = new Formatter();
        f.format("%tm %tB ",cal,cal);
        System.out.println(f);
    }
}
