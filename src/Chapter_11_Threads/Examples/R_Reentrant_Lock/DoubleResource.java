package Chapter_11_Threads.Examples.R_Reentrant_Lock;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Ingener_mobil on 01.12.2016.
 */
public class DoubleResource {
    private Deque<String> list = new LinkedList<String>();
    private Lock lock = new ReentrantLock();
    private Condition isFree = lock.newCondition();
    public void adding(String str,int i){
        try {
            lock.lock();
            list.add(i +"<"+str);
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(50));
            list.add(str+">"+i);
            isFree.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public String deleting(){
        lock.lock();
        String s = list.poll();
        s+=list.poll();
        isFree.signal();
        lock.unlock();
        return s;
    }
    public String toString(){
        return list.toString();
    }
}
