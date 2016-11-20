package Chapter_9_IO.Variant_B.Task_1;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 18.11.2016.
 */
public class Text extends Unit {

    public Text(String title,Sentence ... sentences) {
        this.setTitle(title);
        for(Sentence s : sentences)
            getText().add(s);
    }
    public void textTitle(){
        System.out.print(getTitle());
    }

    public void AddText(Sentence s){
        getText().add(s);
    }

    public void textPrint(){
        System.out.println(getTitle());
        for(Sentence s : getText())
            System.out.print(s.toString());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(getTitle()+"\n");
        for (Sentence s : getText())
            sb.append(s.toString());
        return sb.toString();
    }
    @Override
    public boolean equals(Object o){
        Text t  = (Text)o;
        for(int i = 0;i < getText().size();i++){
            if(getText().get(i).getSentence().equals(t.getText().get(i).getSentence()))
                continue;
            else
                return false;
        }
        return true;
    }
}
