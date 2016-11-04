package Chapter_4_Polimorphizm_and_Inheritance.Examples.Polymorph_from_constructor;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Dumber extends Dumb {
    int id = 9;//two fields with identically names
    Dumber(){
        System.out.println("Вызов конструктора класса Dumber");
        id = this.getId();
        System.out.println(" id="+id);
    }
    @Override
    int getId(){
        System.out.println("getId() класса Dumber");
        return id;
    }
}
