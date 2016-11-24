package Chapter_10_Collections.Variant_A.Task_7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Ingener_mobil on 24.11.2016.
 * Задать два стека, поменять информацию местами.
 */
public class Task_7 {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> stack2 = new ArrayDeque<Integer>();
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();

        stack1.add(10);
        stack1.add(20);

        stack2.add(30);
        stack2.add(40);

        Iterator<Integer> stack1Iterator = stack1.iterator();
        Iterator<Integer> stack2Iterator = stack2.iterator();

        Show(stack1,stack2);

        while (!stack1.isEmpty())
            temp1.add(stack1.pollLast());
        while (!stack2.isEmpty())
            temp2.add(stack2.pollLast());

        for (Integer integer : temp1)
            stack2.add(integer);

        for (Integer integer : temp2)
            stack1.add(integer);
        System.out.println();
        Show(stack1,stack2);
    }

    private static void Show(ArrayDeque<Integer> stack1,ArrayDeque<Integer> stack2){
        for (Integer integer : stack1)
            System.out.println("Stack 1: "+integer);
        for (Integer integer : stack2)
            System.out.println("Stack 2: "+integer);

    }
}
