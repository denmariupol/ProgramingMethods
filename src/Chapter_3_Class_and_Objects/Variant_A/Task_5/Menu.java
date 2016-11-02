package Chapter_3_Class_and_Objects.Variant_A.Task_5;

import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Menu {
    private static Scanner scan = new Scanner(System.in);
    private static Integer input;

    public static void Run() {
        Books.Add();
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
        System.out.println("1.Список книг заданного автора.");
        System.out.println("2.Список книг, выпущенных заданным издательством.");
        System.out.println("3.Список книг, выпущенных после заданного года.");
        System.out.println("0.Выход.");

    }

    private static void SubMenu(Integer subMenu) {
        switch (subMenu) {
            case 1:
                System.out.println("Выберите автора");
                int i = 1;
                for(Author a : Author.values()) {
                    System.out.printf("%d.%s",i,a.getAuthor(a));
                    System.out.println();
                    i++;
                }
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 2:
                PublisherBook();
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 3:
                YearBook();
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            default:
                System.out.println("Неправильный выбор!");
                Menu();
        }
    }

    private static void Action(Integer subMenu,Integer input) {
        switch (subMenu){
            case 1:
                AuthorBook(input);
                break;
            case 2:
                PublisherBook();
                break;
            case 3:
                YearBook();
                break;
        }
    }

    private static void YearBook() {
    }

    private static void PublisherBook() {
    }

    private static void AuthorBook(Integer input) {
        input = --input;
        for(Book b : Books.getBooks()){
            if(b.getAuthor().ordinal() == input)
                System.out.println(b.toString());
        }
    }

    private static void ZeroCheck(Integer subMenu,Integer input){
        if (input == 0)
            Run();
        else
            Action(subMenu, input);
    }

    private static Integer checkInput(Scanner s) {
        while (!s.hasNextInt()) {
            System.out.print("Введите числовое значение: ");
            s = new Scanner(System.in);
        }
        return s.nextInt();
    }
}
