package Chapter_2_DataTypes_and_Operators.VariantB;
import java.util.Scanner;
/**
 * Created by User on 22.10.16.
 */
public class Task_3 {
    public static void main(String[] args) {
        int a = 0,b = 0,c = 0;
        System.out.print("Введите положительные коеффициенты уравнение через пробел : ");
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt() ){
            a = scan.nextInt();
        }

        if (scan.hasNextInt() ){
            b = scan.nextInt();
        }

        if (scan.hasNextInt() )
            c = scan.nextInt();

        if (a < 0 || b < 0){
            System.out.println("а < 0 или b < 0");
            return;
        }


        Square(a,b,c);
    }
    private static void Square(int a,int b,int c){
        double d,x1,x2;
        d= Math.pow(b,2) - 4*a*c;
        x1 = (-b + Math.sqrt(d))/(2*a);
        x2 = (-b - Math.sqrt(d))/(2*a);
        System.out.printf("Корни уравнения : x1 = %.2f, x2 = %.2f",x1,x2);
    }
}
