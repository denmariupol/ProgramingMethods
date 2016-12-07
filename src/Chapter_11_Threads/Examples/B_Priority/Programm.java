package Chapter_11_Threads.Examples.B_Priority;

/**
 * Created by Ingener_mobil on 25.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Priority min = new Priority("min");
        Priority max = new Priority("max");
        Priority norm = new Priority("Norm");
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        min.start();
        norm.start();
        max.start();
    }
}
