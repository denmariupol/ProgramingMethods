package Chapter_3_Class_and_Objects.Variant_A.Task_1;

import javax.swing.text.AbstractDocument;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 31.10.2016.
 */
public class Menu {
    private static Scanner scan = new Scanner(System.in);
    private static Integer input;

    public static void Run() {
        Menu();
        input = scan.nextInt();
        try{
            switch (input) {
                case 1:
                    SubMenu(input);
                    break;
                case 2:
                    SubMenu(input);
                    break;
                case 3:
                    SubMenu(input);
                    break;
                case 4:
                    SubMenu(input);
                    break;
                case 0:
                    System.out.println("До свидания!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Не правильный выбор!");
                    Run();
            }
        }catch (NumberFormatException e){
            System.out.println("Введите числовое значение!");
            Run();
        }
    }
    public static void Menu(){
        System.out.println("-------------------Меню----------------------");
        System.out.println("1.Список студентов факультета.");
        System.out.println("2.Список студентов для каждого факультета или курса.");
        System.out.println("3.Список студентов,родившихся после заданного года.");
        System.out.println("4.Список учебной группы.");
        System.out.println("0.Выход.");

    }
    public static void SubMenu(int choice){
        System.out.println(choice);
        switch (choice){
            case 1:
                int i = 0;
                for(Faculty f : Faculty.values()){
                    i++;
                    System.out.printf("%d.%s",i,f.GetFaculty(f));
                    System.out.println();
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Неправильный выбор!");
                Menu();
        }
    }
}
