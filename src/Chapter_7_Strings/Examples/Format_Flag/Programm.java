package Chapter_7_Strings.Examples.Format_Flag;

import java.util.Formatter;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        //выравнивание вправо
        f.format("|%10.2f|",123.123);
        System.out.println(f);

        f = new Formatter();
        //выравнивание влево
        f.format("|%-10.2f|",123.123);
        System.out.println(f);

        f = new Formatter();
        f.format("%(d",-100);
        System.out.println(f);

        f = new Formatter();
        f.format("%,.2f",123456789.32);
        System.out.println(f);

        f = new Formatter();
        f.format("%.4f",1111.111111);
        System.out.println(f);

        f = new Formatter();
        f.format("%.16s","Now I know class java.util.Formatter");
        System.out.println(f);
    }
}
