package Chapter_11_Threads.Examples.E_Daemon;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Daemon usual = new Daemon();
        Daemon daemon = new Daemon();

        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("!!!!");
    }
}
