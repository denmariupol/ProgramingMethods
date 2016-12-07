package Chapter_11_Threads.Examples.N_ResourcePool;

/**
 * Created by Ingener_mobil on 28.11.2016.
 * Класс AudioChannel предлагает простейшее описание канала и его использования.
 */
public class AudioChannel {
    private int сhannellId;
    public AudioChannel(int id) {
        super();
        this.сhannellId = id;
    }
    public int getСhannellId() {
        return сhannellId;
    }
    public void setСhannellId(int id) {
        this.сhannellId = id;
    }
    public void using() {
        try {
            // использование канала
            Thread.sleep(new java.util.Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}