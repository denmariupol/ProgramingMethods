package Chapter_11_Threads.Examples.P_CountDownLatch;

import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 29.11.2016.
 * Демонстрацией возможностей класса P_CountDownLatch
 * может служить задача выполнения студентами набора заданий
 * (тестов). Студенту предлагается для выполнения набор заданий.
 * Он выполняет их и переходит в режим ожидания оценок по всем
 * заданиям, чтобы вычислить среднее значение оценки.
 * Преподаватель (Tutor) проверяет задание и после каждого
 * проверенного задания сдвигает «щеколду» на единицу.
 * Когда все задания студента проверены, счетчик становится
 * равным нулю и барьер снимается, производятся необходимые
 * вычисления в классе Student.
 */
public class RunLearning {
    public static void main(String[] args) {
        final int NUMBER_TASKS_1 = 5;
        Student student1 = new Student(322801,NUMBER_TASKS_1);
        for (int i = 0; i < NUMBER_TASKS_1; i++) {
            Task t = new Task("Task ##"+i);
            student1.addTask(t);
        }
        final int NUMBER_TASKS_2 = 4;
        Student student2 = new Student(322924,NUMBER_TASKS_2);
        for (int i = 0; i < NUMBER_TASKS_2; i++) {
            Task t = new Task("Task ##"+i);
            student2.addTask(t);
        }
        ArrayList<Student> lst = new ArrayList<Student>();
        lst.add(student1);
        lst.add(student2);
        Tutor tutor = new Tutor(lst);
        student1.start();
        student2.start();
        try {//поток проверки стартует с задержкой
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tutor.start();
    }
}
