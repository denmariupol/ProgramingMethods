package Chapter_11_Threads.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 03.12.2016.
 */
public class Ship extends Thread{
    int shipCapacity = 5;

    public Ship(int shipCapacity){
        this.shipCapacity = shipCapacity;
    }

    public void Load(int containers){
        if(shipCapacity == 0)
            shipCapacity+=containers;
    }
    public void UnLoad()
}
