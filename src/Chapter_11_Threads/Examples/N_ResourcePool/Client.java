package Chapter_11_Threads.Examples.N_ResourcePool;

/**
 * Created by Ingener_mobil on 28.11.2016.
 * Класс Client представляет поток, запрашивающий ресурс из пула, использующий его некоторое
 * время и возвращающий его обратно в пул.
 */
public class Client extends Thread {
    private boolean reading = false;
    private ChannelPool<AudioChannel> pool;
    public Client (ChannelPool<AudioChannel> pool) {
        this.pool = pool;
    }
    public void run() {
        AudioChannel channel = null;
        try {
            channel = pool.getResource(500); // изменить на 100
            reading = true;
            System.out.println("Channel Client #" + this.getId()
                    + " took channel #" + channel.getСhannellId());
            channel.using();
        } catch (ResourсeException e) {
            System.out.println("Client #" + this.getId() + " lost ->"
                    + e.getMessage());
        } catch(NullPointerException e){
            System.out.println("Client #" + this.getId() + " null ->"
                    + e.getMessage());
        }finally {
            if (channel != null) {
                reading = false;
                System.out.println("Channel Client #" + this.getId() + " : "
                        + channel.getСhannellId() + " channel released");
                pool.returnResource(channel);
            }
        }
    }
    public boolean isReading() {
        return reading;
    }
}
