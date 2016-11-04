package Chapter_4_Polimorphizm_and_Inheritance.Examples.Constructors;

/**
 * Created by Ingener_mobil on 04.11.2016.
 * В классе Point3D второй конструктор для завершения инициализации
 * объекта обращаетсяк первому конструктору.
 * Такая конструкция применяется в случае, когда в класс требуется добавить
 * конструктор по умолчанию с обязательным использованием уже
 * существующего конструктора
 */
public class Programm {
    public static void main(String[] args) {
        Point3D p = new Point3D();
        System.out.println(p.toString());
    }
}
