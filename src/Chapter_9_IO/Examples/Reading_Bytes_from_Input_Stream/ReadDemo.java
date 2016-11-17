package Chapter_9_IO.Examples.Reading_Bytes_from_Input_Stream;

import java.io.*;

/**
 * Created by Ingener_mobil on 16.11.2016.
 */
public class ReadDemo {
    public static void main(String[] args) {
        String path = "E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt";
        File file = new File(path);//object to connect with file on disk
        int b,count = 0;
        FileReader fr = null;
        //FileInputStream fr = null;//alternative
        try {
            fr = new FileReader(file);
            //fr = new FileInputStream(file);
            try {
                while ((b = fr.read()) != -1){
                    System.out.print((char)b);
                    count++;
                }
                System.out.println("Bytes: "+count);
            } catch (IOException e) {
                System.out.println("File Error: "+e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+e);
        }finally {

            if(fr != null)
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error closing");
                }
        }
    }
}
