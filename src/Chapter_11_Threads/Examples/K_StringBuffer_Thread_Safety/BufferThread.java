package Chapter_11_Threads.Examples.K_StringBuffer_Thread_Safety;

/**
 * Created by Ingener_mobil on 27.11.2016.
 *  демонстрация «потокобезопасности» класса StringBuffer при вызове
 *  метода append() на синхронизированном экземпляре
 */
public class BufferThread {
    static int counter = 0;
    static StringBuffer s = new StringBuffer();//заменить на StringBuilder

    public static void main (String[] args) throws InterruptedException{
        new Thread() {
            public void run() {
                synchronized (s) {
                    //StringBuffer заблокировал объект s
                    //до окончания работы с ним
                    //Если заменить StringBuffer на StringBuilder,
                    // то остановки потока на заблокированном объекте
                    // не произойдет
                    while (BufferThread.counter++ < 3) {
                        s.append("A");
                        System.out.print("> " + counter + " ");
                        System.out.println(s+".");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } // конец synchronized-блока
            }
        }.start();
        Thread.sleep(100);
        while (BufferThread.counter++<6){
            System.out.print("< "+counter+" ");
            /*
            Вызов метода на синхронизированном другим потоком объекте класса
            StringBuffer приведет к остановке текущего потока до тех пор, пока объект
            не будет разблокирован.
             */

            // в этом месте поток main будет ждать освобождения блокировки объекта s
            s.append("B");
            System.out.println(s+"..");
        }
    }
}
