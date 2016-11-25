package Chapter_11_Threads.Examples.Priority;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Priority extends Thread{
    public Priority(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 71; i++) {
            System.out.println(getName()+" "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
