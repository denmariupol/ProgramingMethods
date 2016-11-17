package Chapter_9_IO.Examples.File_System;

import java.io.File;
import java.io.IOException;
import java.util.Date;;

/**
 * Created by Ingener_mobil on 16.11.2016.
 */
public class FileSystem {
    public static void main(String[] args) {
        File f = new File("E:\\Lessons\\ProgramingMethods\\TestDir\\Test.txt");
        if (f.exists()) {
            System.out.println(f.getName() + " exists");
            if (f.isFile()) {
                System.out.println("File path: " + f.getPath());
                System.out.println("Absolute path : " + f.getAbsolutePath());
                System.out.println("File size: " + f.length());
                System.out.println("Last edited: " + new Date(f.lastModified()));
                System.out.println("File readable: " + f.canRead());
                System.out.println("File writable: " + f.canWrite());
                System.out.println("File deleted: " + f.delete());
            }
        } else {
            System.out.println("File " + f.getName() + " doesn't exist");
        }
        try {
            if (f.createNewFile()) {
                System.out.println("File: " + f.getName() + " is created");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        File dir = new File("E:\\Lessons\\ProgramingMethods\\TestDir");
        dir.mkdir();
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("Directory " + dir.getName() + " exists");
        }
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            Date date = new Date(files[i].lastModified());
            System.out.println("\n" + files[i].getPath() + "\t| " + files[i].length() + "\t| " + date);
        }
        File root = File.listRoots()[0];// list of available root dir's
        System.out.printf("\n%s %,d из %,d свободно.", root.getPath(), root.getUsableSpace(),
                root.getTotalSpace());
    }
}
