package Chapter_9_IO.Examples.Input_From_File;

import java.io.*;

/**
 * Created by Ingener_mobil on 17.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("E:\\Lessons\\ProgramingMethods\\TestDir\\res.txt"));
            String tmp = "";
            while ((tmp = br.readLine())!= null){
                String [] s = tmp.split("\\s");
                for (String s1 : s) {
                    System.out.println(s1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
