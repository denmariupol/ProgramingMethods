package Chapter_1_OOP.VariantA;
import java.util.Random;
/**
 * Created by User on 16.10.16.
 */
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0;i < 5;i++) {
            int j = rand.nextInt(11);
//            System.out.println(j);
            System.out.print(j+" ");
        }
    }
}
