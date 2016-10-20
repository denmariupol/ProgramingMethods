package Chapter_1_OOP.VariantB;

import java.util.Scanner;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
//        i/nt num = scanner.nextInt();
        Fib(0,1,0,5);
    }
    private static void Fib(int num1,int num2,int count,int max){
        if(count < max) {
            int result = num1 + num2;
            num1 = num2;
            count++;
            System.out.print(result + " ");
            Fib(num1, result, count,20);
        }
    }
}
