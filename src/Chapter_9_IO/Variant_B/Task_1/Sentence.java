package Chapter_9_IO.Variant_B.Task_1;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by Ingener_mobil on 18.11.2016.
 */
public class Sentence extends Unit{

    public Sentence(Unit ... sentence){
        Random random = new Random();
        this.setId(random.nextInt(100));
        this.setSentence(sentence);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Unit word : getSentence()){
            sb.append(word);
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public int hashCode(){
        return getId() * getId() + 1;
    }

    @Override
    public boolean equals(Object o){
        Sentence s = (Sentence)o;
        for(int i = 0;i<getSentence().length;i++){
            if(this.getSentence()[i].equals(s.getSentence()[i]))
                continue;
            else
                return false;
        }
        return true;
    }
}
