package Chapter_5_Inner_Classes.Examples.InnerClass_Inside_the_Method;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public abstract class AbstractTeacher {
    private int id;
    public AbstractTeacher(int id){
        this.id = id;
    }
    public abstract boolean excludeStudent(String name);
}
