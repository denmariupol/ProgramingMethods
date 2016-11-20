package Chapter_9_IO.Variant_B.Task_1;

import java.io.*;

/**
 * Created by Ingener_mobil on 20.11.2016.
 */
public class Serializator {
    public boolean serialization(Unit unit,String fileName){
        boolean flag = false;
        File f  = new File(fileName);
        ObjectOutputStream oStream = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            if(fos != null){
                oStream = new ObjectOutputStream(fos);
                oStream.writeObject(unit);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oStream != null)
                try {
                    oStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return flag;
    }

    public Unit deserialization(String fileName) throws InvalidObjectException{
        File f = new File(fileName);
        ObjectInputStream iStream = null;
        try {
            FileInputStream fis = new FileInputStream(f);
            iStream = new ObjectInputStream(fis);
            Unit unit = (Unit) iStream.readObject();
            return unit;
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist: "+e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class doesn't exist: "+e);
        }finally {
            if (iStream != null)
                try {
                    iStream.close();
                } catch (IOException e) {
                    System.out.println("Error of closing stream");
                }
        }
        throw new InvalidObjectException("Object doesn't deserializated");
    }
}
