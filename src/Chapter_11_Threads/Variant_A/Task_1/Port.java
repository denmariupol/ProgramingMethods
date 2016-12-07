package Chapter_11_Threads.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 03.12.2016.
 */
abstract class Port {
    public int capacity;

    @Override
    public String toString(){
        return "Containers :"+capacity;
    }
}
