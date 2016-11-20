package Chapter_9_IO.Examples.Serilization_Deserialization;

import java.io.InvalidObjectException;

/**
 * Created by Ingener_mobil on 17.11.2016.
 */
public class SerializeDeserialize {
    public static void main(String[] args) {
        //creation and writing object
        Student ob = new Student("MMF","Peter",254778,"qwerty");
        System.out.println(ob);
        String file = "E:\\Lessons\\ProgramingMethods\\TestDir\\data.txt";
        Serializator sz = new Serializator();
        boolean b = sz.serialization(ob,file);
//        Student.faculty = "GEO";
        //reading and output
        Student res = null;

        try {
            res = sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
