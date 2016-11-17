package Chapter_9_IO.Examples.Reading_Bytes_Short;

import java.io.*;

/**
 * Created by Ingener_mobil on 16.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr = new FileReader(new File("E:\\Lessons\\ProgramingMethods\\src\\Chapter_7_Strings\\Variant_A\\Task_1\\Source.txt"));
            int b = 0;
            while ((b = fr.read()) != -1)
                System.out.print((char)b);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found: "+e);
        }
        catch (IOException e){
            System.out.println("Error reading file: "+e);
        }
        finally {
            if(fr != null)
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: "+e);
                }
        }

    }
}
