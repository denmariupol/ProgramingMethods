package Chapter_11_Threads.Examples.R_Reentrant_Lock;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ingener_mobil on 01.12.2016.
 * Пусть необходим нереляционный способ сохранения информации
 * в коллекции, когда неделимым квантом информации считается
 * пара или более следующих друг за другом элементов.
 * То есть добавление и удаление элементов может  осуществляться
 * только парами и другой поток не может добавить/удалить свои
 элементы, пока заблокировавший коллекцию поток полностью не
 выполнит  свои действия.

 где результат с пустыми скобками свидетельствует, что попыток
 изъятия пар было больше, чем попыток добавления.
 Нерезультативные попытки не фиксировались
 */
public class SynchroMain {
    public static void main (String[] args) throws InterruptedException{
        for (int i = 0; i < 5; i++) {
            DoubleResource resource = new DoubleResource();
            new ResThread("a",resource).start();
            new ResThread("Z",resource).start();
            new ResThread("#",resource).start();
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println(resource);
        }
    }
}
