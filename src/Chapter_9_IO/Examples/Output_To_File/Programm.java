package Chapter_9_IO.Examples.Output_To_File;

import java.io.*;

/**
 * Created by Ingener_mobil on 17.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        File f = new File("E:\\Lessons\\ProgramingMethods\\TestDir\\res.txt");
        double[]v = {1.10, 1.2, 1.401, 5.01, 6.017, 7, 8};
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for (double v1 : v) {
                pw.printf("Java %.2g%n",v1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(pw != null)
                pw.close();
        }
    }
}
