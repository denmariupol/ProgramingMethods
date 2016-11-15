package Chapter_7_Strings.Variant_B.Task_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Ingener_mobil on 11.11.2016.
 */
public class Word extends Unit implements Comparator<Word>{
    public Word(ArrayList<Character> symbol) {
        StringBuilder sb = new StringBuilder();
        for (Character s : symbol) {
            sb.append(s);
        }
        this.setWord(sb.toString());
    }
    public Word(){}
    @Override
    public String toString(){
        return this.getWord();
    }

    @Override
    public boolean equals(Object o){
        Word w = (Word)o;
        if (this.getWord().equals(w.getWord()))
            return true;
        else return false;
    }
    @Override
    public int compare(Word w1, Word w2){
        if((w2.getDimension() - w1.getDimension()) != 0)
            return w2.getDimension() - w1.getDimension();
        else {
            char[] c1 = w1.getWord().toCharArray();
            char[] c2 = w2.getWord().toCharArray();
            return c1[0]-c2[0];
        }
    }
}
