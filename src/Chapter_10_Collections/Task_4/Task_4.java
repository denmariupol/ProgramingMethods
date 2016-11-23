package Chapter_10_Collections.Task_4;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Ingener_mobil on 23.11.2016.
 * Создать список из элементов каталога и его подкаталогов
 */
public class Task_4 {
    private static LinkedList<File> files = new LinkedList<File>();
    private static LinkedList<File> dirs = new LinkedList<File>();


    public static void main(String[] args) {
        File[] f = File.listRoots()[1].listFiles();
        long startTime = System.currentTimeMillis();
        for (File file : f)
            FileOrDir(file);

        Check(dirs);
        long endTime = System.currentTimeMillis();

        for (File file : files)//and there isn't error!!!
            System.out.println(file);
        System.out.println("Files: "+files.size());
        System.out.println("Time: "+(float)(endTime - startTime)/1000+" s");
    }

    private static void Check(LinkedList<File> dirs) {
        if (!dirs.isEmpty()) {
            File f = dirs.pollLast();
            File[] fls = f.listFiles();
            if (fls != null) {
                for (File file : fls)
                    FileOrDir(file);
            }
            Check(dirs);
        } else {
//            for (File file : files)//there is an error???
//                System.out.println(file);
        }
    }


    private static boolean FileOrDir(File file) {
        if (file.isDirectory()) {
            dirs.add(file);
            return false;
        } else {
            files.add(file);
            return true;
        }
    }
}
