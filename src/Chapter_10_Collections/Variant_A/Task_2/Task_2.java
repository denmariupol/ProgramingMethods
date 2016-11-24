package Chapter_10_Collections.Variant_A.Task_2;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 23.11.2016.
 * Ввести число, занести его цифры в стек. Вывести число, у которого цифры
 идут в обратном порядке.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = null;
        ArrayDeque<Character> stack = new ArrayDeque<Character>();
        System.out.print("Введите число: ");
        if (scanner.hasNextInt())
            number = ((Integer)scanner.nextInt()).toString();
        else {
            System.out.println("Вы ввели не число!");
            return;
        }
        char[]n = number.toCharArray();
        for (int i = 0; i < n.length; i++)
            stack.add(n[i]);

        while (!stack.isEmpty()){
            char c = stack.removeLast();
            System.out.print(c);
        }
    }
}
