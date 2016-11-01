package Chapter_3_Class_and_Objects.Variant_A.Task_1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 31.10.2016.
 */
public class Menu {
    private static Scanner scan = new Scanner(System.in);
    private static Integer input;

    public static void Run() {
        StudentsArray.Create();
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
        System.out.println("1.Список студентов факультета.");
        System.out.println("2.Список студентов для каждого факультета или курса.");
        System.out.println("3.Список студентов,родившихся после заданного года.");
        System.out.println("4.Список учебной группы.");
        System.out.println("0.Выход.");

    }

    private static void SubMenu(Integer subMenu) {
        switch (subMenu) {
            case 1:
                System.out.println("Выберите факультет.");
                int i = 0;
                for (Faculty f : Faculty.values()) {
                    i++;
                    System.out.printf("%d.%s", i, f.GetFaculty(f));
                    System.out.println();
                }
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 2:
                System.out.println("Выберите курс.");
                i = 0;
                for (Grade g : Grade.values()) {
                    i++;
                    System.out.printf("%d.%s", i, g.GetGrade(g));
                    System.out.println();
                }
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 3:
                System.out.println("Введите дату.");
                DateSort(subMenu,input);
                System.out.printf("Для возврата нажмите 0.");
                input = checkInput(scan);
                ZeroCheck(subMenu,input);
                break;
            case 4:
                System.out.println("Выберите группу.");
                i = 0;
                for (Group g : Group.values()) {
                    i++;
                    System.out.printf("%d.%s", i, g.GetGroup(g));
                    System.out.println();
                }
                System.out.printf("Для возврата нажмите 0.");
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
        else
            Action(subMenu, input);
    }
    private static void Action(Integer subMenu, Integer input) {
        switch (subMenu) {
            case 1:
                FacultySort(subMenu,input);
                break;
            case 2:
                GradeSort(subMenu,input);
                break;
            case 3:
                DateSort(subMenu,input);
                break;
            case 4:
                GroupSort(subMenu,input);
                break;
        }
    }

    private static void DateSort(Integer subMenu, Integer input) {
        System.out.print("Введите год: ");
        int year = checkInput(scan);
        System.out.print("Введите месяц: ");
        int mounth = checkInput(scan);
        System.out.print("Введите день: ");
        int day = checkInput(scan);
        GregorianCalendar calendar = new GregorianCalendar(year,mounth,day);
        for (Student student : StudentsArray.getStudents()) {
            if (student.getBirthDate().after(calendar))
                System.out.println(student.toString());
        }

    }

    private static void GroupSort(Integer subMenu, Integer input) {
        input = --input;
        for (Student student : StudentsArray.getStudents()) {
            if (student.getGroup().ordinal() == input)
                System.out.println(student.toString());
        }
        System.out.printf("Для возврата нажмите 0.");
        input = checkInput(scan);
        if (input == 0)
            SubMenu(subMenu);
    }

    private static void GradeSort(Integer subMenu, Integer input) {
        input = --input;
        for (Student student : StudentsArray.getStudents()) {
            if (student.getGrade().ordinal() == input)
                System.out.println(student.toString());
        }
        System.out.printf("Для возврата нажмите 0.");
        input = checkInput(scan);
        if (input == 0)
            SubMenu(subMenu);
    }

    private static void FacultySort(Integer subMenu,Integer input) {
        input = --input;
        for (Student student : StudentsArray.getStudents()) {
            if (student.getFaculty().ordinal() == input)
                System.out.println(student.toString());
        }
        System.out.printf("Для возврата нажмите 0.");
        input = checkInput(scan);
        if (input == 0)
            SubMenu(subMenu);
    }

    private static Integer checkInput(Scanner s) {
        while (!s.hasNextInt()) {
            System.out.print("Введите числовое значение: ");
            s = new Scanner(System.in);
        }
        return s.nextInt();
    }
}
