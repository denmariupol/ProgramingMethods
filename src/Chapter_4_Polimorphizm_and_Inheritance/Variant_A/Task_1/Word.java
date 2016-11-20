package Chapter_4_Polimorphizm_and_Inheritance.Variant_A.Task_1;

import java.util.Random;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
class Word {

    private  int id;
    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word){
        Random random = new Random();
        this.id = random.nextInt(100);
        this.word = word;
    }
    @Override
    public String toString(){
        return word;
    }
    @Override
    public int hashCode(){
        return id * id + 1;
    }
    @Override
    public boolean equals(Object o){
        Word w = (Word)o;
        return (this.word.equals(w.word)) ? true : false;
    }
}
