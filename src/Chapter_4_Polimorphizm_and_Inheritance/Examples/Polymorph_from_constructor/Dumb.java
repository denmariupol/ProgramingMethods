package Chapter_4_Polimorphizm_and_Inheritance.Examples.Polymorph_from_constructor;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Dumb extends Object {
    {this.id = 6;}
    int id;
    Dumb(){
        System.out.println("Вызов конструктора класса Dumb");
        //вызов потенциально полиморфного метода- плохо
        id = this.getId();
        System.out.println(" id="+id);
    }
    int getId(){
        System.out.println("getId() класса Dumb");
        return id;
    }
}
