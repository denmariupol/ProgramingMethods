package Chapter_1_OOP.VariantA;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created by User on 16.10.16.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя : ");
        String name = scan.nextLine();
        System.out.printf("Привет ,%s",name);
    }
}
