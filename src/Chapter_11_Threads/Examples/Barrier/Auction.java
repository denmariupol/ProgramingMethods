package Chapter_11_Threads.Examples.Barrier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Ingener_mobil on 28.11.2016.
 *
 */
public class Auction {
    private ArrayList<Bid> bids;
    private CyclicBarrier barrier;
    public final int BIDS_NUMBER = 5;
    public Auction(){
        this.bids = new ArrayList<Bid>();
        this.barrier = new CyclicBarrier(this.BIDS_NUMBER, new Runnable() {
            @Override
            public void run() {
                Bid winner = Auction.this.defineWinner();
                System.out.println("Bid #"+winner.getBidId()+", price:"+winner.getPrice()+" win!");
            }
        });
    }
    public CyclicBarrier getBarrier(){
        return barrier;
    }
    public boolean add(Bid e){
        return bids.add(e);
    }
    public Bid defineWinner(){
        return Collections.max(bids, new Comparator<Bid>() {
            @Override
            public int compare(Bid o1, Bid o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }
}
