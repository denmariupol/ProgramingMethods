package Chapter_3_Class_and_Objects.Examples.Generics;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        //параметризация типом Integer
        Message<Integer> ob1 = new Message<Integer>();
        ob1.setValue(1);//возможен только тип Integer для SetValue
        int v1 = ob1.getValue();
        System.out.println(v1);
        //параметризация типом String
        Message<String> ob2 = new Message<String>("Java");
//        ob2.setValue("Java");
        String s1 = ob2.getValue();
        System.out.println(s1);
//        ob1 = ob2;//несовместимость типов
        // параметризация типом Object
        Message ob3 = new Message();
        ob3 = ob1;
        System.out.println(ob3.getValue());
        ob3.setValue(new Byte((byte) 1));
        ob3.setValue("Java SE 7");
        System.out.println(ob3);
        ob3.setValue(71);
        System.out.println(ob3);
    }
}
