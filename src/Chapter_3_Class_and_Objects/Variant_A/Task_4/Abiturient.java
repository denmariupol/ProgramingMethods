package Chapter_3_Class_and_Objects.Variant_A.Task_4;

import java.util.Comparator;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Abiturient implements Comparable<Abiturient>{
    private String name;
    private Integer[] marks;
    private Integer marksSum = 0;

    public Integer getMarksSum() {
        return marksSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getMarks() {
        return marks;
    }

    public void setMarks(Integer[] marks) {
        this.marks = marks;
    }

    public Abiturient(String name, Integer[] marks) {
        this.name = name;
        this.marks = marks;

        for (int i = 0; i < marks.length; i++) {
            this.marksSum+=marks[i];
        }

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Имя: "+name+" Оценки:");
        for (Integer i : marks){
            sb.append(" "+i);
        }
        sb.append(" Сумма баллов: "+marksSum);
        return  sb.toString();
    }


    @Override
    public int compareTo(Abiturient o) {
        return this.marksSum.compareTo(o.marksSum);
    }
}
