package Chapter_3_Class_and_Objects.Variant_A.Task_3;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 01.11.2016.
 */
public class Menu {
    private static Scanner scan = new Scanner(System.in);
    private static Integer input;

    public static void Run() {
        Patients.Add();
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
        System.out.println("1.Список пациентов с данным диагнозом.");
        System.out.println("2.Список пациентов с мед.номером в заданном интервале.");
        System.out.println("0.Выход.");

    }

    private static void SubMenu(Integer subMenu) {
        switch (subMenu) {
            case 1:
                SortPatients();
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 2:
                MedSort();
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            default:
                System.out.println("Неправильный выбор!");
                Menu();
        }
    }

    private static void SortPatients() {
        int i = 0;
        for (Diagnose d : Diagnose.values()) {
            i++;
            System.out.printf("%d.%s",i,d.getDiagnose(d));

            System.out.println();
        }
        input = checkInput(scan);
        input = --input;
        for(Patient p : Patients.getPatients()){
            if(p.getDiagnose().ordinal() == input)
                System.out.println(p.toString());
        }
    }

    private static void ZeroCheck(Integer subMenu,Integer input){
        if (input == 0)
            Run();
    }


    private static void MedSort() {
        System.out.print("Введите 1-е число диапазона:");
        int first = checkInput(scan);
        System.out.print("Введите 2-е число диапазона:");
        int second = checkInput(scan);
        for(Patient p : Patients.getPatients()){
            if (p.getMedNumber() > first && p.getMedNumber() < second)
                System.out.println(p.toString());
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
