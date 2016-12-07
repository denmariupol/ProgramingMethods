package Chapter_11_Threads.Examples.A_Thread;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class T_Thread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Walk!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
