package Chapter_1_OOP.VariantB;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 16.10.16.
 */
public class Task {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            list.add(rand.nextInt(200) - 100);
            list1.add(rand.nextDouble() * (200 - 100) - 150);
            if(i < 2)
                list2.add(rand.nextInt(100));
        }

       // NegPos(list);
        //MinMax(list);
        //ThreeOrNine(list);
        //FiveAndSeven(list);
        //BubbleSort(list);
        //RepetingNumbers(list1);
        NodNok(list2);
    }

    private static void NegPos(ArrayList<Integer> list) {
        System.out.print("Negative numbers : ");
        for (Integer num : list) {
            if (num < 0)
                System.out.print(num + " ");
        }
        System.out.print(" Positive numbers : ");
        for (Integer num : list) {
            if (num > 0)
                System.out.print(num + " ");
        }
        System.out.println();
    }


    private static void MinMax(ArrayList<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        System.out.print("Minimal number : ");
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);
        }

        System.out.print(min);
        System.out.print(" Maximal number : ");
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        System.out.print(max);
    }


    private static void ThreeOrNine(ArrayList<Integer> list) {
        System.out.println();
        System.out.print("Number divided by 3 : ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0)
                System.out.print(list.get(i) + " ");
        }
        System.out.print(" Number divided by 9 : ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 9 == 0)
                System.out.print(list.get(i) + " ");
        }
    }


    private static void FiveAndSeven(ArrayList<Integer> list) {
        System.out.println();
        System.out.print("Number divided by 5 and 7 : ");
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 5 == 0) && (list.get(i) % 7 == 0))
                System.out.print(list.get(i) + " ");
        }

    }


    private static void BubbleSort(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) > list.get(i)) {
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                count++;
            }
        }
        if (count != 0)
            BubbleSort(list);
        else {
            System.out.println();
            System.out.println("Bubble sort...");
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
        }

    }


    private static void RepetingNumbers(ArrayList<Double> list1) {
        System.out.println();
        System.out.println("Repeting numbers ");
        String pattern = "##0.0000";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        for (int i = 0; i < list1.size(); i++) {
            String[] s = decimalFormat.format(list1.get(i)).split(",");
            char []ch = s[1].toCharArray();

            int c = 0;
            for (int j = 0; j < ch.length - 1; j++) {
                for (int k = j+1;k<ch.length;k++){
                    if(ch[j] == ch[k])
                        c++;
                }
            }
            if (c == 0)
                System.out.print(decimalFormat.format(list1.get(i))+" ");

        }
    }


    private static void NodNok(ArrayList<Integer> list) {
        int nok = list.get(0);
        int nod = nok;

        for (int i = 1; i < list.size(); i++)
        {
            nod = GetNod(nod, list.get(i));
//            nok = getNOK(nok, arr[i]); // функции getNOK и getNOD для двух чисел
        }
        System.out.println("Nod : "+nod);
    }

    private static int GetNod(int a,int b) {
        for(;;) {
            if (a > b)
                a = a % b;
            else
                b = b % a;

            if (a == 0 || b == 0)
                return a + b;
        }
    }

    private static int GetnNok(int a,int b){
        return 0;
    }
}
