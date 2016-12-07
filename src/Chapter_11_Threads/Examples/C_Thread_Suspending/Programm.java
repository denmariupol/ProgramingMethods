package Chapter_11_Threads.Examples.C_Thread_Suspending;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Programm {
    static {
        System.out.println("Starting main thread");
    }

    public static void main(String[] args) {
        JoinThread t1 = new JoinThread("First");
        JoinThread t2 = new JoinThread("Second");

        t1.start();
        t2.start();

        try {
            //поток main остановлен до окончания работы
            //потока t1
            //блокирует работу потока, в котором он вызван,
            // до тех пор, пока не будет закончено выполнение
            // вызывающего метод потока или не истечет время
            // ожидания при обращении к методу join(long timeout).
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
