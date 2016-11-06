package Chapter_5_Inner_Classes.Variant_A.Task_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Notepad> notes = new ArrayList<Notepad>();
    public static void MainMenu(){

        System.out.println("1.Просмотр записей по дате");
        System.out.println("2.Добавление записей на дату");
        System.out.println("0.Выход");
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            Choice(choice);
        }else{
            System.out.println("Не правильный выбор");
            MainMenu();
        }
    }
    private static void Choice(int choice){
        switch (choice){
            case 0:
                System.out.println("До свидания");
                System.exit(0);
                break;
            case 1:
                ShowNotes();
                break;
            case 2:
                Add();
                break;
            default:
                System.out.println("Не правильный выбор");
                MainMenu();
        }
    }

    private static void ShowNotes() {
        for (Notepad n : notes) {
            System.out.println(n.toString());
        }
        MainMenu();
    }

    private static void Add() {
        int date = 0;
        System.out.println("Введите дату");
        scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            date = scanner.nextInt();
        } else {
            System.out.println("Не правильный формат даты");
            Add();
        }
        System.out.println("Введите сообщение");
        String text = scanner.next();
        Notepad n = CheckDate(date,text);
        if(n != null)
            EditNote(n,text);
        else
            AddNote(date,text);
        MainMenu();
    }

    private static Notepad CheckDate(int date, String text) {
        for (Notepad note : notes) {
            if (note.getDate() == date)
                return note;
        }
        return null;
    }

    private static void EditNote(Notepad notepad, String text) {
        notepad.Edit(text);
    }

    private static void AddNote(int date, String text) {
        Notepad notepad = new Notepad(date);
        notepad.Init(text);
        notes.add(notepad);
    }
}
