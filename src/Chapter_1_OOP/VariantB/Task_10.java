package Chapter_1_OOP.VariantB;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.10.2016.
 */
public class Task_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200)-100);

        NumberFrequency(list);
    }
    private static void NumberFrequency(ArrayList<Integer> list) {
        ArrayList<Number> numbers = new ArrayList<Number>();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        for(int i = 0;i < list.size();i++){
            int count = 0;
            for (int j = 0;j < list.size();j++){
                if (list.get(i) == list.get(j))
                    count++;

            }
            numbers.add(new Number(count,list.get(i)));
        }
        ClearList(numbers);
    }
    private static void ClearList(ArrayList<Number> numbers) {
        for (int i = 0; i <numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(i).val == numbers.get(j).val)
                    numbers.remove(numbers.get(j));
            }
        }
        Sort(numbers);
    }

    private static void Sort(ArrayList<Number> num) {
        int count = 0;
        for (int i = 0; i < num.size() - 1; i++) {
            if (Comp(num.get(i),num.get(i + 1))) {
                Number temp = num.get(i);
                num.set(i, num.get(i + 1));
                num.set(i + 1, temp);
                count++;
            }
        }
        if (count != 0)
            Sort(num);
        else {
            System.out.println();
            System.out.println("Bubble sort...");
            for (int j = 0; j < num.size(); j++) {
                System.out.print(num.get(j).count + "->"+num.get(j).val+" ");
            }
        }
    }
    private static boolean Comp(Number n1, Number n2) {
        if(n2.count > n1.count)
            return true;
        else
            return false;
    }
    private static class Number{
        private int count;
        private int val;

        public int getCount() {
            return count;
        }

        public int getVal() {
            return val;
        }
        Number(int count,int val){
            this.count = count;
            this.val = val;
        }
    }
}
