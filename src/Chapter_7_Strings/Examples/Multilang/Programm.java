package Chapter_7_Strings.Examples.Multilang;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("1 - английский /n 2 - белорусский \n любой - русский");
            char j = 0;
            try{
                j = (char)System.in.read();
            }catch (IOException e){
                e.printStackTrace();
            }
            String country = "";
            String language = "";
            switch (j){
                case 1:
                    country = "US";
                    language = "EN";
                    break;
                case 2:
                    country = "BY";
                    language = "BE";
                    break;
            }
            Locale current = new Locale(language,country);
            ResourceBundle rb = ResourceBundle.getBundle("Chapter_7_Strings.Examples.Multilang.property.text",current);
            String s1 = rb.getString("er");
            System.out.println(s1);

            String s2 = rb.getString("str2");
            System.out.println(s2);
        }
    }
}
