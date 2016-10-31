package Chapter_3_Class_and_Objects.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 30.10.2016.
 */
public class Student {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String birthDate;
    private String address;
    private String phone;
    private Faculty faculty;
    private Grade grade;
    private Group group;


    public Student(int id,String name,String surname,String patronymic,
                   String birthDate,String address,String phone,Faculty faculty,Grade grade,Group group){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.grade = grade;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Grade getGrade() {
        return grade;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder("ID: "+this.id+" Имя: "+this.name+" Фамилия: "+this.surname+
                " Отчество: "+this.patronymic+" Дата рождения: "+this.birthDate+" Адрес: "+this.address+
                " Телефон: "+this.phone+" Факультет: "+this.faculty.GetFaculty(faculty)+" Курс: "+this.grade.GetGrade(grade)+" Группа: "+this.group.GetGroup(group));
        return sb.toString();
    }
}
