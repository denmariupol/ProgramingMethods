package Chapter_3_Class_and_Objects.Variant_A.Task_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 31.10.2016.
 */
public class Menu {
    private static Scanner scan = new Scanner(System.in);
    private static Integer input;

    public static void Run() {
        Arr.addCustomers();
        Menu();
        input = checkInput(scan);

        if(input < 5 && input >0)
            SubMenu(input);
        else if (input == 0){
            System.out.println("До свидания!");
            System.exit(0);
        }else{
            System.out.println("Не правильный выбор!");
            Run();
        }
    }

    private static void Menu() {
        System.out.println("-------------------Меню----------------------");
        System.out.println("1.Список покупателей в алфавитном порядке.");
        System.out.println("2.Список покупателей с номером в заданном порядке.");
        System.out.println("0.Выход.");

    }

    private static void SubMenu(Integer subMenu) {
        switch (subMenu) {
            case 1:
                Collections.sort(Arr.getCustomers().subList(0, Arr.getCustomers().size()));

                for(Customer c : Arr.getCustomers())
                    System.out.println(c.getName());

                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 2:
                CardSort();
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            default:
                System.out.println("Неправильный выбор!");
                Menu();
        }
    }

    private static void ZeroCheck(Integer subMenu,Integer input){
        if (input == 0)
            Run();
    }


    private static void CardSort() {
        System.out.print("Введите 1-е число диапазона:");
        int first = checkInput(scan);
        System.out.print("Введите 1-е число диапазона:");
        int second = checkInput(scan);
        for(Customer c : Arr.getCustomers()){
            if (c.getCreditNumber() > first && c.getCreditNumber() < second)
                System.out.println(c.toString());
        }
        System.out.printf("Для возврата нажмите 0.");
        input = checkInput(scan);
        if (input == 0)
            Run();
    }


    private static Integer checkInput(Scanner s) {
        while (!s.hasNextInt()) {
            System.out.print("Введите числовое значение: ");
            s = new Scanner(System.in);
        }
        return s.nextInt();
    }
}
