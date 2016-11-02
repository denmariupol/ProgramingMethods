package Chapter_3_Class_and_Objects.Variant_A.Task_5;

import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Books {
    private static ArrayList<Book> books = new ArrayList<Book>();

    public static ArrayList<Book> getBooks() {
        return books;
    }
    public static void Add(){
        books.add(new Book("Белый клык",Author.LONDON,Publisher.PUBLISHER_1,1985));
        books.add(new Book("Мгла",Author.KING,Publisher.PUBLISHER_2,1983));
        books.add(new Book("Маугли",Author.KIPLING,Publisher.PUBLISHER_3,1981));
        books.add(new Book("Белый клык",Author.KING,Publisher.PUBLISHER_1,1995));
        books.add(new Book("Потерявший лицо",Author.LONDON,Publisher.PUBLISHER_3,1999));
        books.add(new Book("Нам-Бок лжец",Author.LONDON,Publisher.PUBLISHER_3,1987));
    }
}
