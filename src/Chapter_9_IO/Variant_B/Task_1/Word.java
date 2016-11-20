package Chapter_9_IO.Variant_B.Task_1;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by Ingener_mobil on 18.11.2016.
 */
public class Word extends Unit {

    public Word(String word){
        Random random = new Random();
        this.setId(random.nextInt(100));
        this.setWord(word);;
    }
    @Override
    public String toString(){
        return getWord();
    }
    @Override
    public int hashCode(){
        return getId() * getId() + 1;
    }
    @Override
    public boolean equals(Object o){
        Word w = (Word)o;
        return (this.getWord().equals(w.getWord())) ? true : false;
    }
}
