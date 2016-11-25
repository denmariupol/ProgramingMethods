package Chapter_11_Threads.Examples.Thread;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class R_Runnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Run!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
