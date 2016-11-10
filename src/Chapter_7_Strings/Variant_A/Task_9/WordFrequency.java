package Chapter_7_Strings.Variant_A.Task_9;

/**
 * Created by Ingener_mobil on 10.11.2016.
 */
public class WordFrequency {
    private String word;
    private int frequency = 0;

    public String getWord() {
        return word;
    }

    public int getFrequency() {
        return frequency;
    }

    public void addFrequency() {
        this.frequency++;
    }

    public WordFrequency(String word) {
        this.word = word;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Слово: "+word+" Повторяется:"+frequency);
        return sb.toString();
    }
}
