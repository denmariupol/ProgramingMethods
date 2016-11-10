package Chapter_7_Strings.Variant_A.Task_10;

/**
 * Created by Ingener_mobil on 10.11.2016.
 */
public class Letter {
    char ch;
    int frequency=0;

    public char getCh() {
        return ch;
    }

    public int getFrequency() {
        return frequency;
    }

    public Letter(char ch) {
        this.ch = ch;
    }
    public void addFrequency(){
        this.frequency++;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Символ: "+ch+" встречается: "+frequency);
        return sb.toString();
    }
}
