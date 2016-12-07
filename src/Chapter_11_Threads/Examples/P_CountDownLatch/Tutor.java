package Chapter_11_Threads.Examples.P_CountDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Ingener_mobil on 29.11.2016.
 */
public class Tutor  extends Thread{
    private Integer idTutor;
    private List<Student> list;

    public Tutor() {
        this.list = new ArrayList<>();
    }

    public Tutor(List<Student> list) {
        this.list = list;
    }

    public Integer getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(Integer idTutor) {
        this.idTutor = idTutor;
    }

    public void run(){
        for (Student st : list) {
            //проверить ,выданы ли студенту задания
            List<Task> tasks = st.getTaskList();
            for (Task current : tasks) {
                //проверить наличие ответа
                int mark = 3+new Random().nextInt(7);
                current.setMark(mark);
                System.out.println(mark+" for student N "+st.getIdStudent());
                st.getCountDownLatch().countDown();
            }
            System.out.println("All estimates made for "+st.getIdStudent());
        }
    }

}
