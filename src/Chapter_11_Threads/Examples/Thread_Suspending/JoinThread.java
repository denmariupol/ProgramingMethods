package Chapter_11_Threads.Examples.Thread_Suspending;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class JoinThread extends Thread{
    public JoinThread(String name){
        super(name);
    }
    public void run(){
        String nameT = getName();
        long timeout = 0;
        System.out.println("Thread start: "+nameT);
        try {
            switch (nameT){
                case "First":
                    timeout = 5000;
                    break;
                case "Second":
                    timeout = 1000;
                    break;
            }
            Thread.sleep(timeout);
            System.out.println("Thread ending: "+nameT);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
