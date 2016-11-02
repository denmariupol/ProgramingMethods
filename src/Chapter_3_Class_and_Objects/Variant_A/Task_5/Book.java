package Chapter_3_Class_and_Objects.Variant_A.Task_5;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Book {
    private String name;
    private Author author;
    private Publisher publisher;
    private Integer year;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Integer getYear() {
        return year;
    }

    public Book(String name, Author author, Publisher publisher, Integer year) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Название: "+name+" Автор: "+author.getAuthor(author)+" Издатель:"
                                                +publisher.getPublisher(publisher)+" Год: "+year);
        return sb.toString();
    }
}
