package Chapter_7_Strings.Examples.Groups_Quantificators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ingener_mobil on 07.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        String input = "abdcxyz";
        Simplematches("([a-z]*)([a-z]+)",input);
        Simplematches("([a-z]?)([a-z]+)",input);
        Simplematches("([a-z]+)([a-z]*)",input);
        Simplematches("([a-z]?)([a-z]?)",input);
    }
    private static void Simplematches(String regex,String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("First group: "+matcher.group(1));
            System.out.println("Second group: "+matcher.group(2)+"\n");
        }else
            System.out.println("Nothing \n");
    }
}
