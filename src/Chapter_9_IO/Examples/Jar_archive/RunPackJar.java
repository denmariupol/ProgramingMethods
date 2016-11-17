package Chapter_9_IO.Examples.Jar_archive;

import java.io.FileNotFoundException;

/**
 * Created by Ingener_mobil on 17.11.2016.
 */
public class RunPackJar {
    public static void main(String[] args) {
        String dirName = "E:\\Lessons\\ProgramingMethods\\TestDir";
        PackJar pj = new PackJar("example.jar");
        try {
            pj.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
