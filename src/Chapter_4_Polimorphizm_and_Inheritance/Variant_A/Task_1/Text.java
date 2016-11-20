package Chapter_4_Polimorphizm_and_Inheritance.Variant_A.Task_1;

import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
class Text {
    private String title;
    private ArrayList<Sentence> text = new ArrayList<Sentence>();

    public Text(String title,Sentence ... sentences) {
        this.title = title;
        for(Sentence s : sentences)
            text.add(s);
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }

    public void textTitle(){
        System.out.print(title);
    }

    public void AddText(Sentence s){
        text.add(s);
    }

    public void textPrint(){
        System.out.println(title);
        for(Sentence s : text)
            System.out.print(s.toString());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(title+"\n");
        for (Sentence s : text)
            sb.append(s.toString());
        return sb.toString();
    }
    @Override
    public boolean equals(Object o){
        Text t  = (Text)o;
        for(int i = 0;i < text.size();i++){
            if(text.get(i).getSentence().equals(t.getText().get(i).getSentence()))
                continue;
            else
               return false;
        }
        return true;
    }
}
