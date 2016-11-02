package Chapter_3_Class_and_Objects.Variant_A.Task_4;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Menu {
    private static Scanner scan = new Scanner(System.in);
    private static Integer input;

    public static void Run() {
        Abiturients.Add();
        Menu();
        input = checkInput(scan);

        if(input < 4 && input >0)
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
        System.out.println("1.Список абитуриентов, имеющих неудовлетворительные оценки.");
        System.out.println("2.список абитуриентов, у которых сумма баллов выше заданной.");
        System.out.println("3.выбрать заданное число n абитуриентов, имеющих самую высокую\n" +
                            " сумму баллов.");
        System.out.println("0.Выход.");

    }

    private static void SubMenu(Integer subMenu) {
        switch (subMenu) {
            case 1:
                BadMarks();
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 2:
                markSum();
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 3:
                hiSum();
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            default:
                System.out.println("Неправильный выбор!");
                Menu();
        }
    }

    private static void hiSum() {
        System.out.println("Студенты с максимальным кол-вом баллов");
        Collections.sort(Abiturients.getAbiturients());
        for(int i = Abiturients.getAbiturients().size() - 1;i >= 0;i--){
                System.out.println(Abiturients.getAbiturients().get(i).toString());
        }
    }

    private static void markSum() {
        System.out.println("Введите кол-во баллов");
        Integer input = checkInput(scan);

        for(Abiturient a : Abiturients.getAbiturients()){
            int sum = 0;
            for (int i = 0; i < a.getMarks().length; i++) {
                sum+=a.getMarks()[i];
            }
            if(sum > input)
                System.out.println(a.toString());
        }
    }

    private static void BadMarks() {
        for(Abiturient a : Abiturients.getAbiturients()){
            for (int i = 0; i < a.getMarks().length; i++) {
                if(a.getMarks()[i] < 3)
                    System.out.println(a.toString());
            }

        }
    }

    private static void ZeroCheck(Integer subMenu,Integer input){
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
