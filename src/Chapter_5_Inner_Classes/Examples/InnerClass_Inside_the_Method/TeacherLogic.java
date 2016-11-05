package Chapter_5_Inner_Classes.Examples.InnerClass_Inside_the_Method;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class TeacherLogic {
    public void ExcludeProcess(int rectorId,String nameStudent){
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);

        System.out.println("Студент: "+ nameStudent+" отчислен "+ teacher.excludeStudent(nameStudent));
    }
}
