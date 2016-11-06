package Chapter_6_Interface_and_Annotation.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public interface Publishment<T extends Book>{
    void Publish(T book);
}
