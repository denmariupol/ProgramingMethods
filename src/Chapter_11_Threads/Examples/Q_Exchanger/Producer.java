package Chapter_11_Threads.Examples.Q_Exchanger;

/**
 * Created by Ingener_mobil on 29.11.2016.
 */
public class Producer extends Subject implements Runnable {
    public Producer(String name, Item item) {
        super(name, item);
    }

    @Override
    public void run() {
        try {
            synchronized (item) {//блок синхронизации не нужен,но желателен
                int proposedNumber = this.getItem().getNumber();
                //обмен синхронизоваными экземплярами
                item = exchanger.exchange(item);
                if(proposedNumber <= item.getNumber()){
                    System.out.println("Producer "+getName()+
                    " повышает план производства товара");
                }else{
                    System.out.println("Producer "+getName()+
                            " снижает план производства товара");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
