package Chapter_11_Threads.Examples.Reentrant_Lock;

import java.util.Random;

/**
 * Created by Ingener_mobil on 01.12.2016.
 */
public class ResThread extends Thread {
    private DoubleResource resource;
    public ResThread(String name,DoubleResource rs){
        super(name);
        resource = rs;
    }
    public void run(){
        for (int i = 0; i < 4; i++) {
            if(new Random().nextInt(2)>0)
                resource.adding(getName(),i);
            else
                resource.deleting();
        }
    }
}
