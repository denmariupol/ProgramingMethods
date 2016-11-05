package Chapter_5_Inner_Classes.Examples.InnerClass_Inside_the_Method;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Teacher extends AbstractTeacher {
    public Teacher(int id) {
        super(id);
    }

    @Override
    public boolean excludeStudent(String name) {
        return false;
    }
}
