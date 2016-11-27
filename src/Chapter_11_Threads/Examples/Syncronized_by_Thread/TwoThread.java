package Chapter_11_Threads.Examples.Syncronized_by_Thread;

/**
 * Created by Ingener_mobil on 27.11.2016.
 * Синхронизировать объект можно не только при помощи методов с
 * соответствующим модификатором,
 * но и при помощи синхронизированного блока кода.
 В этом случае происходит блокировка объекта, указанного
 в инструкции synchronized, и он становится недоступным
 для других синхронизированных методов и блоков.
 Такая синхронизация позволяет сузить область синхронизации,
 т. е. вывести за пределы синхронизации код, в ней не нуждающийся.
 Обычные методы на синхронизацию внимания не обращают, поэтому
 ответственность за грамотную блокировку объектов ложится на программиста

 Если в коде убрать синхронизацию объекта s, то вывод будет другим, так
 как другой поток сможет получить доступ к объекту и изменить его раньше,
 чем первый закончит выполнение цикла.
 */
public class TwoThread {
    public static int counter = 0;
    public static void main(String[] args) {
        final StringBuilder s = new StringBuilder();
        new Thread(){
            public void run(){
                synchronized (s){
                    do{
                        s.append("A");
                        System.out.println(s);
                        try{
                            Thread.sleep(100);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }while (TwoThread.counter++ < 2);
                }
            }
        }.start();
        new Thread(){
            public void run(){
                synchronized (s){
                    do{
                        s.append("B");
                        System.out.println(s);
                        try{
                            Thread.sleep(100);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }while (TwoThread.counter++ < 6);
                }
            }
        }.start();
    }
}
