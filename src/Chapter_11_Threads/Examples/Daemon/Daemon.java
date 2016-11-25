package Chapter_11_Threads.Examples.Daemon;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Daemon extends Thread {
    public void run(){
        try{
            if(isDaemon()){
                System.out.println("Starting daemon-thread");
/*Поток-демон (из-за вызова метода sleep(10000)) не успел
завершить выполнение своего кода до завершения основного
потока приложения, связанного с методом main(). Базовое
свойство потоков-демонов заключается в возможности основного
 потока приложения завершить выполнение потока-демона
 (в отличие от обычных потоков) с окончанием кода метода main(),
  не обращая внимания на то, что поток-демон еще работает.
  Если уменьшать время задержки потока-демона, то он может
   успеть завершить свое выполнение до окончания работы основного
    потока.
*/
                Thread.sleep(10000);
            }else{
                System.out.println("Starting of usual thread");
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }finally {
            if(isDaemon())
                System.out.println("Stopping of daemon thread");
            else
                System.out.println("Stopping of usual thread");
        }
    }
}
