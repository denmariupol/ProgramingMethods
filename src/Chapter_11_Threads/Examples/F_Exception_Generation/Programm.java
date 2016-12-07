package Chapter_11_Threads.Examples.F_Exception_Generation;

/**
 * Created by Ingener_mobil on 25.11.2016.
 * Основной поток избавлен от необходимости обрабатывать исключения
 в порожденных потоках.
 В данной ситуации верно и обратное: если основной поток прекратит свое
 выполнение из-за необработанного исключения, то это не скажется на
 работоспособности порожденного им потока.
 */
public class Programm {
    public static void main(String[] args) throws InterruptedException {
        new ExceptThread().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}
