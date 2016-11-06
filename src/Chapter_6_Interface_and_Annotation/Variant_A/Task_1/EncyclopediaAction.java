package Chapter_6_Interface_and_Annotation.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class EncyclopediaAction implements Publishment<Encyclopedia> {
    @Override
    public void Publish(Encyclopedia b) {
        System.out.println(b.name+" опубликован по цене: "+b.price);
    }
}
