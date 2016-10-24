package Chapter_2_DataTypes_and_Operators.VariantC.Task_1;

/**
 * Created by User on 23.10.16.
 */
public class Row {
    private int [] numbers;
    private int sum;

    public Row(int[] numbers) {
        this.numbers = numbers.clone();
        for (int number : numbers) {
            this.sum += number;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getSum() {
        return sum;
    }
}
