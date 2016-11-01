package Chapter_3_Class_and_Objects.Variant_A.Task_1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentsArray {
    private static ArrayList<Student> students = new ArrayList<Student>();

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void Create(){
        students.add(new Student(223,"Иван","Никифоров","Иванович",
                new GregorianCalendar(1980, Calendar.JUNE, 25),"ул.Киевская д.25 кв.16","067-990-52-65", Faculty.INGINEER, Grade.FIRST, Group.INFORMATICS));
        students.add(new Student(123,"Дмитрий","Федоров","Иванович",
                new GregorianCalendar(1986, Calendar.JUNE, 13),"ул.Таганрогская д.16 кв.25","097-800-54-35",Faculty.PEDAGOGICAL,Grade.SECOND,Group.HISTORY));
        students.add(new Student(432,"Александр","Алексеев","Алексеевич",
                new GregorianCalendar(1988, Calendar.MARCH, 15),"ул.Артемовская д.34 кв.18","098-123-32-45",Faculty.INGINEER,Grade.FOURTH,Group.PHYSICS));
        students.add(new Student(643,"Григорий","Антонов","Александрович",
                new GregorianCalendar(1994, Calendar.DECEMBER, 5),"ул.Одесская д.12 кв.20","050-422-66-15",Faculty.PEDAGOGICAL,Grade.THIRD,Group.HISTORY));
        students.add(new Student(345,"Федор","Марков","Иванович",
                new GregorianCalendar(1993, Calendar.NOVEMBER, 13),"ул.Владимирская д.6 кв.15","093-542-99-85",Faculty.BUILD,Grade.SECOND,Group.MATERIAL));
        students.add(new Student(764,"Денис","Иванов","Николаевич",
                new GregorianCalendar(1986, Calendar.AUGUST, 5),"ул.Новоазовская д.2 кв.16","095-654-55-56",Faculty.PEDAGOGICAL,Grade.FIRST,Group.HISTORY));
        students.add(new Student(875,"Виктор","Федоров","Федорович",
                new GregorianCalendar(1984, Calendar.FEBRUARY, 7),"ул.Куйбышева д.5 кв.45","096-934-76-34",Faculty.INGINEER,Grade.FIFTH,Group.PHYSICS));
        students.add(new Student(435,"Алексей","Кожедуб","Иванович",
                new GregorianCalendar(1992, Calendar.JUNE, 2),"ул.Александровская д.12 кв.88","097-234-75-76",Faculty.BUILD,Grade.FIFTH,Group.MATERIAL));
        students.add(new Student(234,"Ольга","Никифорова","Ивановна",
                new GregorianCalendar(1987, Calendar.JULY, 3),"ул.Весеняя д.85 кв.16","098-653-23-23",Faculty.BUILD,Grade.THIRD,Group.MATERIAL));
        students.add(new Student(253,"Виктория","Сазонова","Федоровна",
                new GregorianCalendar(1986, Calendar.AUGUST, 8),"ул.Пушкинская д.125 кв.86","050-235-34-25",Faculty.PEDAGOGICAL,Grade.FOURTH,Group.HISTORY));
        students.add(new Student(523,"Анжела","Ветрова","Николаевна",
                new GregorianCalendar(1980, Calendar.JANUARY, 25),"ул.Газетная д.225 кв.116","097-543-65-54",Faculty.PEDAGOGICAL,Grade.SECOND,Group.HISTORY));
    }


}
