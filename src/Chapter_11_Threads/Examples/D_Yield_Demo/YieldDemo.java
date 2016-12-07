package Chapter_11_Threads.Examples.D_Yield_Demo;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class YieldDemo {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                //Активизация метода yield() в коде метода run() первого
                // объекта потока приведет к тому, что, скорее всего,
                // первый поток будет остановлен на некоторый квант
                //времени, что даст возможность другому потоку запуститься и выполнить свой код
                System.out.println("Starting A_Thread 1");
                Thread.yield();
                System.out.println("Stopping A_Thread 1");
            }
        }.start();
        new Thread(){
            public void run(){
                System.out.println("Starting A_Thread 2");
                Thread.yield();
                System.out.println("Stopping A_Thread 2");
            }
        }.start();
    }
}
