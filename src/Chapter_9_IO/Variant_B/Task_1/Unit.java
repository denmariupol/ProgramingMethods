package Chapter_9_IO.Variant_B.Task_1;

import Chapter_6_Interface_and_Annotation.Variant_A.Task_1_1.Task_1.Publishment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ingener_mobil on 20.11.2016.
 */
public abstract class Unit implements Serializable{
    private int id;
    private String word;
    private Unit [] sentence;
    private String title;
    private ArrayList<Sentence> text = new ArrayList<Sentence>();


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Unit[] getSentence() {
        return sentence;
    }
    public void setSentence(Unit[] sentence) {
        this.sentence = sentence;
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }
    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }

    public Unit(){}






}
