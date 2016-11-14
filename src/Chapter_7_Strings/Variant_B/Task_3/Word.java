package Chapter_7_Strings.Variant_B.Task_3;

import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 11.11.2016.
 */
public class Word extends Unit {
    public Word(ArrayList<Character> symbol) {
        StringBuilder sb = new StringBuilder();
        for (Character s : symbol) {
            sb.append(s);
        }
        this.setWord(sb.toString());
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
}
