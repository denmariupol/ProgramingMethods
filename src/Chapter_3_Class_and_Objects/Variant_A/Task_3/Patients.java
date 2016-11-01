package Chapter_3_Class_and_Objects.Variant_A.Task_3;

import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 01.11.2016.
 */
public class Patients {
    private static ArrayList<Patient> patients = new ArrayList<Patient>();

    public static ArrayList<Patient> getPatients() {
        return patients;
    }

    public static void Add(){
        patients.add(new Patient("Игорь",1254,Diagnose.GRIP));
        patients.add(new Patient("Николай",2547,Diagnose.ORZ));
        patients.add(new Patient("Владимир",3254,Diagnose.PROSTUDA));
        patients.add(new Patient("Стас",4523,Diagnose.PROSTUDA));
        patients.add(new Patient("Василий",1256,Diagnose.GRIP));
    }
}
