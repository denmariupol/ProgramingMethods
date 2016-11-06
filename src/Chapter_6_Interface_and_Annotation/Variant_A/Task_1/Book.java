package Chapter_6_Interface_and_Annotation.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public abstract class Book {
    public String name;
    public int pages;
    public String author;
    public int price;

    public Book(String name,int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public abstract void SetPrice();
}
