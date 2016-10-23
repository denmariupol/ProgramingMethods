package Chapter_2_DataTypes_and_Operators.VariantB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by User on 23.10.16.
 */
public class Task_4 {
    public static void main(String[] args) {

        int mounth = 0;
        System.out.print("Введите номер месяца : ");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                mounth = scan.nextInt();
                Mounths(mounth);
                break;
            }else {
                System.out.print("Неверный ввод,попробуте еще раз :");
                scan = new Scanner(System.in);
            }
        }


    }
    private static void Mounths(int mounth){
        switch (mounth){
            case 1:System.out.println("Январь");break;
            case 2:System.out.println("Февраль");break;
            case 3:System.out.println("Март");break;
            case 4:System.out.println("Апрель");break;
            case 5:System.out.println("Май");break;
            case 6:System.out.println("Июнь");break;
            case 7:System.out.println("Июль");break;
            case 8:System.out.println("Август");break;
            case 9:System.out.println("Сентябрь");break;
            case 10:System.out.println("Октябрь");break;
            case 11:System.out.println("Ноябрь");break;
            case 12:System.out.println("Декабрь");break;
            default:System.out.println("Неверный ввод");break;
        }
    }
}
