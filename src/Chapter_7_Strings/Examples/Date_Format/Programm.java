package Chapter_7_Strings.Examples.Date_Format;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.zip.DataFormatException;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public class Programm {
    public static void main(String[] args) throws ParseException {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date d = null;
        String str = "May 9, 2012";
        try {
            d = df.parse(str);
            System.out.println(d);
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru","RU"));
        System.out.println(df.format(d));
        df = DateFormat.getDateInstance(DateFormat.FULL,Locale.GERMAN);
        System.out.println(df.format(d));

//        Date d = new Date();
//        Locale []locales = DateFormat.getAvailableLocales();
//        for (Locale locale : locales) {
//            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
//            System.out.println(locale.toString()+" -> "+df.format(d));
//        }
    }
}
