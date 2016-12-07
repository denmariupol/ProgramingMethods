package Chapter_11_Threads.Examples.G_Exception_in_Main_Thread;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class SimpleThread extends Thread {
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of simple thread");
    }
}
