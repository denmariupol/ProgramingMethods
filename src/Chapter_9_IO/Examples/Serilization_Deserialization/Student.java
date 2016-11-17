package Chapter_9_IO.Examples.Serilization_Deserialization;

import java.io.Serializable;

/**
 * Created by Ingener_mobil on 17.11.2016.
 * Сериализуемый класс
 */
public class Student implements Serializable{
    protected static String faculty;// can't seriazile
    private String name;
    private int id;
    private transient String password;//can't seriazile
    private static long serialVersionUID = 1L;//can't seriazile
    //private Address addr = new Address(); // не поддерживающее сериализацию поле

//    public class Address {  при таком объявлении класса сериализация не возможна
// поля, методы  т.к. нет implements Serializable
//    }
    public Student(String nameOfFaculty,String name, int id, String password) {
        faculty = nameOfFaculty;
        this.name = name;
        this.id = id;
        this.password = password;
    }
    @Override
    public String toString(){
        return "\nfaculty " + faculty + "\nname " + name + "\nID " + id + "\npassword " + password;
    }
}
