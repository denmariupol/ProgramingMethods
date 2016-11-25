package Chapter_11_Threads.Examples.Exception_Generation;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class ExceptThread extends Thread {
    public void run(){
        boolean flag = true;
        if(flag)
            throw new RuntimeException();
        System.out.println("end of ExceptThread");
    }
}
