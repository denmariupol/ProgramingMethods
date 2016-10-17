package Chapter_1_OOP.VariantA;

/**
 * Created by User on 16.10.16.
 */
public class Task2 {
    public static void main(String[] args) {
        for (int i = args.length - 1;i == 0;i--)
            System.out.printf("Элемент %d имеет значение %s",i,args[i]);
    }
}
