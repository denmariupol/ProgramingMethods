package Chapter_3_Class_and_Objects.Variant_A.Task_1;

import java.util.ArrayList;

public class StudentsArray {
    private static ArrayList<Student> students = new ArrayList<Student>();

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void Create(){
        students.add(new Student(223,"Иван","Никифоров","Иванович",
                "25.06.1980","ул.Киевская д.25 кв.16","067-990-52-65",Faculty.INGINEER,Grade.FIRST,Group.INFORMATICS));
        students.add(new Student(123,"Дмитрий","Федоров","Иванович",
                "13.06.1986","ул.Таганрогская д.16 кв.25","097-800-54-35",Faculty.PEDAGOGICAL,Grade.SECOND,Group.HISTORY));
        students.add(new Student(432,"Александр","Алексеев","Алексеевич",
                "15.03.1988","ул.Артемовская д.34 кв.18","098-123-32-45",Faculty.INGINEER,Grade.FOURTH,Group.PHYSICS));
        students.add(new Student(643,"Григорий","Антонов","Александрович",
                "05.12.1994","ул.Одесская д.12 кв.20","050-422-66-15",Faculty.PEDAGOGICAL,Grade.THIRD,Group.HISTORY));
        students.add(new Student(345,"Федор","Марков","Иванович",
                "13.11.1993","ул.Владимирская д.6 кв.15","093-542-99-85",Faculty.BUILD,Grade.SECOND,Group.MATERIAL));
        students.add(new Student(764,"Денис","Иванов","Николаевич",
                "05.08.1986","ул.Новоазовская д.2 кв.16","095-654-55-56",Faculty.PEDAGOGICAL,Grade.FIRST,Group.HISTORY));
        students.add(new Student(875,"Виктор","Федоров","Федорович",
                "07.02.1984","ул.Куйбышева д.5 кв.45","096-934-76-34",Faculty.INGINEER,Grade.FIFTH,Group.PHYSICS));
        students.add(new Student(435,"Алексей","Кожедуб","Иванович",
                "02.06.1992","ул.Александровская д.12 кв.88","097-234-75-76",Faculty.BUILD,Grade.FIFTH,Group.MATERIAL));
        students.add(new Student(234,"Ольга","Никифорова","Ивановна",
                "03.07.1987","ул.Весеняя д.85 кв.16","098-653-23-23",Faculty.BUILD,Grade.THIRD,Group.MATERIAL));
        students.add(new Student(253,"Виктория","Сазонова","Федоровна",
                "08.08.1985","ул.Пушкинская д.125 кв.86","050-235-34-25",Faculty.PEDAGOGICAL,Grade.FOURTH,Group.HISTORY));
        students.add(new Student(523,"Анжела","Ветрова","Николаевна",
                "25.01.1980","ул.Газетная д.225 кв.116","097-543-65-54",Faculty.PEDAGOGICAL,Grade.SECOND,Group.HISTORY));
    }


}
