package Chapter_11_Threads.Examples.Exchanger;


/**
 * Created by Ingener_mobil on 29.11.2016.
 */
public class Consumer extends Subject implements Runnable {
    public Consumer(String name, Item item) {
        super(name, item);
    }

    @Override
    public void run() {
        try {
            synchronized (item) {//блок синхронизации не нужен ,но показателен
                int requireNumber = item.getNumber();
                item = exchanger.exchange(item);
                if (requireNumber >= item.getNumber()) {
                    System.out.println("Consumer " + getName()
                            + " повышает стоимость товара");
                } else {
                    System.out.println("Consumer " + getName()
                            + " снижает стоимость товара");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
