package Chapter_3_Class_and_Objects.Examples.Generics_1;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Exam<Double> md1 = new Exam<Double>(71.41D,"Prog");
        Exam<Double> md2 = new Exam<Double>(71.45D,"Prog");
        System.out.println(md1.equalsToMark(md2));
        Exam<Integer> mi = new Exam<Integer>(71,"Prog");
//        md1.equalsToMark(mi); //несоответствие типов при Exam<T> ob
        md1.equalsToMark(mi);//все ок,т.к. Exam<?> ob расширение на любой допустимый тип
    }
}
