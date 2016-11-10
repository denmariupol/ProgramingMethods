package Chapter_7_Strings.Variant_A.Task_11;

/**
 * Created by Ingener_mobil on 10.11.2016.
 */
public class Sentence {
    private String sentence;
    private int vowel = 0;
    private int consonant = 0;

    public String getSentence() {
        return sentence;
    }

    public int getVowel() {
        return vowel;
    }

    public int getConsonant() {
        return consonant;
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }
    public void addVowel(){
        this.vowel++;
    }
    public void addConsonant(){
        this.consonant++;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(getSentence()+"\nГласных: "+vowel+" согласных: "+consonant);
        return sb.toString();
    }
}
