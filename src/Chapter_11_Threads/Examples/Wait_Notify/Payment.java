package Chapter_11_Threads.Examples.Wait_Notify;

import java.util.Scanner;

/**
 * Created by Ingener_mobil on 28.11.2016.
 */
public class Payment {
    private int amount;
    private boolean close;

    public int getAmount() {
        return amount;
    }
    public boolean isClose(){
        return close;
    }

    public synchronized void doPayment(){
        try {
            System.out.println("Start payment: ");
            while (amount <= 0){
                this.wait();//остановка потока и освобождение блокировки
                //после возврата блокировки выполение будет продолжено
            }
            close = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment is closed: "+close);
    }
    public void initAmount(){
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextInt();
    }
}
