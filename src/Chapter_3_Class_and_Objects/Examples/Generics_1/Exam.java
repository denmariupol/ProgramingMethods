package Chapter_3_Class_and_Objects.Examples.Generics_1;

/**
 * Created by Ingener_mobil on 02.11.2016.
 * Такая запись говорит о том, что в качестве типа Т разрешено применять
 только классы, являющиеся наследниками (подклассами) реального класса
 Number,
 */
public class Exam<T extends Number> {
    private String name;
    private T mark;
    public Exam(T mark,String name){
        this.mark = mark;
        this.name = name;
    }

    public T getMark() {
        return mark;
    }

    private int roundMark(){
        return Math.round(mark.floatValue());
    }
//    только с типами Number
//    public boolean equalsToMark(Exam<T> ob){
//        return roundMark() == ob.roundMark();
//    }
    public boolean equalsToMark(Exam<?> ob){
        return roundMark() == ob.roundMark();
    }

}
