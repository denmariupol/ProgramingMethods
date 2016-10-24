package Chapter_2_DataTypes_and_Operators.VariantC.Task_3;

import java.util.ArrayList;

/**
 * Created by den on 2016-10-24.
 */
public  class Sequence
{
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private int count;

    public Sequence(ArrayList<Integer> numbers, int count)
    {
        for(Integer i : numbers)
            this.numbers.add(i);
        this.count = count;
    }

    public ArrayList<Integer> getNumbers()
    {
        return numbers;
    }

    public int getCount()
    {
        return count;
    }
}

