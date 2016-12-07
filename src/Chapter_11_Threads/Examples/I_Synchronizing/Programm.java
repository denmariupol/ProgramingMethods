package Chapter_11_Threads.Examples.I_Synchronizing;

import java.io.IOException;

/**
 * Created by Ingener_mobil on 26.11.2016.
 */
public class Programm {
    public static void main(String[] args) throws InterruptedException {
        Resource s = null;
        try{
        s = new Resource("E:\\Lessons\\ProgramingMethods\\TestDir\\Syncronized.txt");
        SyncThread t1 = new SyncThread("First",s);
        SyncThread t2 = new SyncThread("Second",s);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            s.close();
        }
    }

}
