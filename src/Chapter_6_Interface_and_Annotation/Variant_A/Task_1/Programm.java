package Chapter_6_Interface_and_Annotation.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 06.11.2016.
 * Создать и реализовать интерфейсы, также использовать наследование и полиморфизм
 * для следующих предметных областей:
 1. interfaceИздание -> abstractclassКнига -> classСправочник и Энциклопедия.
 */
public class Programm {
    public static void main(String[] args) {
        Catalogue catalog = new Catalogue("Каталог",100,"Джек");
        catalog.SetPrice();
        Publishment<Catalogue> Epublish = new CatalogueAction();
        Epublish.Publish(catalog);
        Encyclopedia encyclopedia = new Encyclopedia("Энциклопедия",150,"Миша");
        encyclopedia.SetPrice();
        Publishment<Encyclopedia> Cpublish= new EncyclopediaAction();
        Cpublish.Publish(encyclopedia);

    }

}
