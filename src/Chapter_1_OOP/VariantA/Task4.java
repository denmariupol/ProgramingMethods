package Chapter_1_OOP.VariantA;
import java.util.Scanner;
/**
 * Created by User on 16.10.16.
 */
public class Task4 {
    public static void main(String[] args) {
        String passw = "123";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пароль : ");
        String input = scan.next();
        while (!passw.equals(input))
        {
            System.out.println("Не правильно,ведите еще раз ...");
            input = scan.next();
        }
        System.out.println("Пароль верен");
    }
}
