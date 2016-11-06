package Chapter_5_Inner_Classes.Variant_A.Task_1;

import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Notepad {
    private int date;
    private Note note;

    public Notepad(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    private class Note{
        private ArrayList<String> notes = new ArrayList<String>();

        public ArrayList<String> getNotes() {
            return notes;
        }

        public void AddNote(String n){
            notes.add(n);
        }
    }
    public void Init(String text){
        note = new Note();
        note.AddNote(text);
    }
    public void Edit(String text){
        note.AddNote(text);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Дата: "+date+"\n");

        int i = 1;
        for (String s : note.notes) {
            sb.append(" "+i+".Сообщение: "+s+"\n");
            i++;
        }
        return sb.toString();
    }
}
