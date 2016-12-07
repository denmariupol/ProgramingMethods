package Chapter_11_Threads.Examples.Q_Exchanger;

/**
 * Created by Ingener_mobil on 29.11.2016.
 * Поток Producer представляет информацию о количестве произведенного товара, поток Consumer
 * — о количестве проданного. В результате обмена производитель
 * снизит план производства, если количество проданного товара
 * меньше произведенного. Потребитель, к тому же,
 * снижает цену на товар, так как поступления товара больше,
 * чем продано за время, предшествующее обмену
 */
public class RunExchange {
    public static void main(String[] args) {
        Item ss1 = new Item(34,2200);
        Item ss2 = new Item(34,2100);
        new Thread(new Producer("HP",ss1)).start();
        new Thread(new Consumer("Retail Trade",ss2)).start();
    }
}
