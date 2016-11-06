package Chapter_6_Interface_and_Annotation.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public class Encyclopedia extends Book {
    public Encyclopedia(String name,int pages, String author) {
        super(name,pages, author);
    }


    @Override
    public void SetPrice() {
        price = new java.util.Random().nextInt(100);
    }
}
