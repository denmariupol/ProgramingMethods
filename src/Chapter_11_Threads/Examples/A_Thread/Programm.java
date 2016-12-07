package Chapter_11_Threads.Examples.A_Thread;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        //новые объекты потоков разными способами
        T_Thread t = new T_Thread();
        /*Интерфейс Runnable не имеет метода start(), а только единственный метод
        run(). Поэтому для запуска такого потока, как WalkRunnable следует создать
        экземпляр класса A_Thread с передачей экземпляра WalkRunnable его конструктору.
        */
        Thread r = new Thread(new R_Runnable());
        //запуск потоков
        t.start();
        r.start();
//        t.run();//выполнится метод ,но поток не запустится
//        r.run();
    }
}
