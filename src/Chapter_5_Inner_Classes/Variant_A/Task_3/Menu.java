package Chapter_5_Inner_Classes.Variant_A.Task_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Account> operations = new ArrayList<Account>();
    private static Account account = new Account();
    public static void Run(){
        account.Init();
        System.out.println(account.toString());
        MainMenu();
    }
    public static void MainMenu(){

        System.out.println("1.Просмотр операций");
        System.out.println("2.Добавление средств");
        System.out.println("3.Снятие средств");
        System.out.println("4.Оплата");
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
                ShowOperations();
                break;
            case 2:
                AddFunds(account);
                break;
            case 3:
                SubtractFunds(account);
                break;
            case 4:
                Payment(account);
                break;
            default:
                System.out.println("Не правильный выбор");
                MainMenu();
        }
    }

    private static void AddFunds(Account account) {
        account.Init();
        int money = new java.util.Random().nextInt(100);
        account.Action(money,Action.CASHIN,"Поступление средств");
        operations.add(account);
        System.out.println("На счет поступило "+money);
        MainMenu();
    }

    private static void SubtractFunds(Account account) {
        account.Init();
        int money = new java.util.Random().nextInt(100);
        account.Action(money,Action.CASHOUT,"Расход средств");
        operations.add(account);
        System.out.println("Со счета списано "+money);
        MainMenu();
    }
    private static void Payment(Account account) {
        account.Init();
        int money = new java.util.Random().nextInt(100);
        account.Action(money,Action.PAYMENT,"Расход средств");
        operations.add(account);
        System.out.println("Со счета списано "+money);
        MainMenu();
    }
    private static void ShowOperations() {
        System.out.println(account.toString());
        MainMenu();
    }

}

