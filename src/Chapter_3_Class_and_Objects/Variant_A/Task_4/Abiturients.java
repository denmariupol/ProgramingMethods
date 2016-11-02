package Chapter_3_Class_and_Objects.Variant_A.Task_4;

import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public class Abiturients {
    private static ArrayList<Abiturient> abiturients = new ArrayList<Abiturient>();

    public static ArrayList<Abiturient> getAbiturients() {
        return abiturients;
    }

    public static void Add(){
        abiturients.add(new Abiturient("Денис",new Integer[]{5,5,5,5}));
        abiturients.add(new Abiturient("Игорь",new Integer[]{5,2,4,3}));
        abiturients.add(new Abiturient("Максим",new Integer[]{4,5,2,4}));
        abiturients.add(new Abiturient("Владимир",new Integer[]{5,3,3,4}));
        abiturients.add(new Abiturient("Илья",new Integer[]{5,4,4,4}));
        abiturients.add(new Abiturient("Александр",new Integer[]{2,4,4,3}));
    }
}
