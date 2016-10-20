package Chapter_1_OOP.VariantB;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_16 {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++)
        {
            int Cnk = 1; // согласно (1)
            System.out.print(Cnk);
            for (int k = 1; k <= n; k++)
            {
                Cnk *= (n - k + 1); // согласно (2)
                Cnk /= k;           // тут обязано делиться нацело
                System.out.print(" "); System.out.print(Cnk);
            }
            System.out.println();
        }
    }

}
