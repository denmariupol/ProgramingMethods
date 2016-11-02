package Chapter_3_Class_and_Objects.Examples.Logic_Block;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Department {
    {
        System.out.println("logic(1) id="+this.id);
    }
    static {
        System.out.println("static logic");
    }
    private int id = 7;
    public Department(int id){
        this.id = id;
        System.out.println("Конструктор id="+id);
    }

    public int getId() {
        return id;
    }
}
