package Chapter_9_IO.Examples.Array_Output;

import java.io.*;

/**
 * Created by Ingener_mobil on 16.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        String[] pArray = {"2013", "Java 8"};
        File fByte = new File("E:\\Lessons\\ProgramingMethods\\TestDir\\fByte.txt");
        File fSymb = new File("E:\\Lessons\\ProgramingMethods\\TestDir\\fSymb.txt");
        FileOutputStream fos = null;
        FileWriter fw = null;
        try {
            fos = new FileOutputStream(fByte);
            fw = new FileWriter(fSymb);
            for (String s : pArray) {
                fos.write(s.getBytes());
                fw.write(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
