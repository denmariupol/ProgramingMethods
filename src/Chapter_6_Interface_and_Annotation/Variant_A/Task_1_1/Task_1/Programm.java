package Chapter_6_Interface_and_Annotation.Variant_A.Task_1_1.Task_1;

/**
 * Created by Ingener_mobil on 06.11.2016.
 * Создать и реализовать интерфейсы, также использовать наследование и полиморфизм
 * для следующих предметных областей:
 1. interfaceИздание -> abstractclassКнига -> classСправочник и Энциклопедия.
 */
public class Programm {
    public static void main(String[] args) {
        Book catalogue = new Catalogue("Каталог",100,"Джек");
        catalogue.SetPrice();
        Publishment<Book> action = new Action();
        action.Publish(catalogue);
        Book encyclopedia = new Encyclopedia("Энциклопедия",250,"Миша");
        encyclopedia.SetPrice();
        action.Publish(encyclopedia);
    }

}
