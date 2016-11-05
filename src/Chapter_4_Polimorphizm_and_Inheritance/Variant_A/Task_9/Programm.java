package Chapter_4_Polimorphizm_and_Inheritance.Variant_A.Task_9;

/**
 * Created by Ingener_mobil on 05.11.2016.
 * Создать объект класса Круг, используя классы
 * Точка, Окружность.
 Методы: задание размеров, изменение радиуса,
 определение принадлежности точки данному кругу
 */
public class Programm {
    public static void main(String[] args) {
        Dot dot1 = new Dot(2,3);
        Dot dot2 = new Dot(-4,3);
        Circle circle = new Circle(dot1,5);
        Circle circle1 = new Circle(dot2,5);
        if(circle.isLayIn(dot2))
            System.out.println("Lay In");
        else
            System.out.println("Don't lay in");

        System.out.println(circle.toString());
        if(circle.equals(circle1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
