package Chapter_4_Polimorphizm_and_Inheritance.Examples.CloneObject;



/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class CloneRunner {
    public static void mutation(Student p) {
        try{
            p = (Student)p.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        p.setId(1000);
        System.out.println("->id="+p.getId());
    }
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println("id="+st.getId());
        mutation(st);
        System.out.println("id="+st.getId());
    }
}
