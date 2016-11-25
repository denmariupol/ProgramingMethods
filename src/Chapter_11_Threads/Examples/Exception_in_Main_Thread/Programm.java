package Chapter_11_Threads.Examples.Exception_in_Main_Thread;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        new SimpleThread().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
