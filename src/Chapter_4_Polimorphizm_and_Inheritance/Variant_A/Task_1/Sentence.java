package Chapter_4_Polimorphizm_and_Inheritance.Variant_A.Task_1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
class Sentence {
    private Word [] sentence;
    private int id;
    public Word[] getSentence() {
        return sentence;
    }

    public Sentence(Word ... sentence){
        Random random = new Random();
        this.id = random.nextInt(100);
        this.sentence = sentence.clone();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Word word : sentence){
            sb.append(word);
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public int hashCode(){
        return id * id + 1;
    }

    @Override
    public boolean equals(Object o){
        Sentence s = (Sentence)o;
        for(int i = 0;i<sentence.length;i++){
            if(this.sentence[i].equals(s.sentence[i]))
                continue;
            else
                return false;
        }
        return true;
    }
}
