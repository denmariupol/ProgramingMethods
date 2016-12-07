package Chapter_11_Threads.Examples.O_Barrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Ingener_mobil on 28.11.2016.
 * Класс Bid определяет предложение клиента на аукционе и запрашивает барьер, после которого клиент либо заплатит за лот,
 * либо будет продолжать работать дальше
 */
public class Bid extends Thread {
    private Integer bidId;
    private int price;
    private CyclicBarrier barrier;

    public Bid(Integer bidId, int price, CyclicBarrier barrier) {
        this.bidId = bidId;
        this.price = price;
        this.barrier = barrier;
    }

    public Integer getBidId() {
        return bidId;
    }

    public int getPrice() {
        return price;
    }
    public void run(){
        try {
            System.out.println("Client "+this.bidId+" specifies a price");
            Thread.sleep(new Random().nextInt(3000));//время на раздумье
            //определение уровня повшения цены
            int delta = new Random().nextInt(50);
            price+=delta;
            System.out.println("Bid "+this.bidId+" : "+price);
            this.barrier.await();//остановка у барьера
            System.out.println("Continue to work");//проверить кто выиграл
            //и оплатить в случае победы
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
