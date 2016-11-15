package Chapter_7_Strings.Variant_B.Task_8;

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
    public void Dimension(){
        String[]alph = {"а","е","и","о","у","э","ю","я"};
        float a = 0;
        char[]ch = getWord().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(Arrays.asList(alph).contains(Character.toString(ch[i])))
                a++;
        }
        this.setDimension(a/ch.length);
    }
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
        char[] c1 = w1.getWord().toCharArray();
        char[] c2 = w2.getWord().toCharArray();
        return c1[1]-c2[1];
    }
}
