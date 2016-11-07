package Chapter_7_Strings.Examples.String_Format;

import java.util.Formatter;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("This %s is about %n%S %c","book","java",'8');
        System.out.println(f);
    }
}
