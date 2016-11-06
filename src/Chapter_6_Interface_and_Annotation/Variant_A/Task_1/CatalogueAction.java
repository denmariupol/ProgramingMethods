package Chapter_6_Interface_and_Annotation.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class CatalogueAction implements Publishment<Catalogue> {
    @Override
    public void Publish(Catalogue b) {
        System.out.println(b.name+" опубликован по цене: "+b.price);
    }


}
