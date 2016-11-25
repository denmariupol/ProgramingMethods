package Chapter_11_Threads.Examples.Atomic_Field;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Broker extends Thread {
    private Market market;
    private static final int PAUSE = 500;
    public Broker(Market market){
        this.market = market;
    }

    @Override
    public void run(){
        try {
            while (true) {
                System.out.println("Current index: "+market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
