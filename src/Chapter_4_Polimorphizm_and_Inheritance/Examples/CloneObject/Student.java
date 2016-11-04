package Chapter_4_Polimorphizm_and_Inheritance.Examples.CloneObject;

import java.util.Vector;

/**
 * Created by Ingener_mobil on 04.11.2016.
 * Если же поле клонируемого типа является изменяемым объектным типом,
 * то для корректного клонирования требуется другой
 подход. Причина заключается в том, что при создании копии поля оригинал
 и копия представляют собой ссылку на один и тот же объект
 */
public class Student implements Cloneable {
    private int id  = 71;
    private String name;
    private int age;
    private Vector<Byte> v = new Vector<Byte>();//изменяемое поле
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    /*
    Если же поле клонируемого типа является изменяемым объектным типом,
            * то для корректного клонирования требуется другой
    подход. Причина заключается в том, что при создании копии поля оригинал
    и копия представляют собой ссылку на один и тот же объект
*/
//    @Override
//    public Student clone(){
//       Student copy = null;
//        try {
//            copy = (Student)super.clone();
//            copy.v = (Vector<Byte>)v.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return copy;
//    }
}
