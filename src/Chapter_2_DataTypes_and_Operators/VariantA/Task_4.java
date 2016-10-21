package Chapter_2_DataTypes_and_Operators.VariantA;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 21.10.2016.
 */
public class Task_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++)
            list.add(rand.nextInt(200000));
        Difference(list);
    }
    private static void Difference(ArrayList<Integer> list){
        ArrayList<Number> number = new ArrayList<Number>();
        for (int i = 0; i < list.size(); i++) {
            int[]num = new int[10];
            char[]ch = String.valueOf(list.get(i)).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                switch (ch[j]){
                    case '0':num[0] +=1;break;
                    case '1':num[1] +=1;break;
                    case '2':num[2] +=1;break;
                    case '3':num[3] +=1;break;
                    case '4':num[4] +=1;break;
                    case '5':num[5] +=1;break;
                    case '6':num[6] +=1;break;
                    case '7':num[7] +=1;break;
                    case '8':num[8] +=1;break;
                    case '9':num[9] +=1;break;
                }
            }
            number.add(new Number(list.get(i),num));
        }
        Result(number);
    }

    private static void Result(ArrayList<Number> number) {
        int min = number.get(0).getCount();
        for (int i = 1; i < number.size(); i++) {
            System.out.print(number.get(i).getCount()+"->"+number.get(i).getValue()+" ");
            if(number.get(i).getCount() < min)
                min = number.get(i).getCount();
        }
        System.out.println();
        for (Number number1 : number) {
            if (number1.getCount() == min){
                System.out.print(number1.getCount()+" ->"+number1.getValue());
                break;
            }
        }
    }

    private static class Number{
        private int value;
        private int count;
        private int [] num;

        public int[] getNum() {
            return num;
        }

        public int getCount(){
            return count;
        }
        public int getValue() {
            return value;
        }


        public Number(int value,  int[] num) {
            for (int i : num) {
                if (i <=1)
                    i=0;
                else
                    this.count +=i;
            }
            this.value = value;
            this.num = num;
        }
    }
}
