package Chapter_11_Threads.Examples.Synchronizing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Ingener_mobil on 26.11.2016.
 */
public class Resource {
    private FileWriter fileWriter;

    public Resource(String file) throws IOException {
        File f = new  File(file);
        f.createNewFile();
        fileWriter = new FileWriter(file,true);
    }
    //при удалении synchronized в файл выводится битая информация
    public synchronized void writing(String str,int i){
        try {
            fileWriter.append(str+i);
            System.out.println(str+i);
            Thread.sleep((long)(Math.random()*50));
            fileWriter.append("->"+i+" ");
            System.out.println("->"+i+" ");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void close(){
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
