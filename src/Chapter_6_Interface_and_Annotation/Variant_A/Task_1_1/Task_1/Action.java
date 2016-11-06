package Chapter_6_Interface_and_Annotation.Variant_A.Task_1_1.Task_1;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class Action implements Publishment<Book> {
    @Override
    public void Publish(Book b) {
        System.out.println(b.name+" опубликован по цене: "+b.price);
    }
}
