package Chapter_11_Threads.Examples.L_Wait_Notify;

/**
 * Created by Ingener_mobil on 28.11.2016.
 * Метод wait(), вызванный внутри синхронизированного блока или метода,
 останавливает выполнение текущего потока и освобождает от блокировки захваченный объект. Возвратить блокировку объекта потоку можно вызовом метода notify() для одного потока или notifyAll() для всех потоков. Если ожидающих потоков несколько, то после вызова методаnotify() невозможно определить,
 какой поток из ожидающих потоков заблокирует объект. Вызов может быть
 осуществлен только из другого потока, заблокировавшего в свою очередь
 тот же самый объект.
 */
public class PaymentRunner {
    public static void main(String[] args) throws InterruptedException {
        final Payment payment = new Payment();
        new Thread() {
            public void run() {
                payment.doPayment();
            }
        }.start();
        Thread.sleep(200);
        synchronized (payment) {//1-й блок
            System.out.println("Init amount:");
            payment.initAmount();
            payment.notify();//уведомление о возврате блокировки
        }
        synchronized (payment) {
            payment.wait(1000);
            System.out.println("ok");
        }
    }
}
