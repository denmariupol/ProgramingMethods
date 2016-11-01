package Chapter_3_Class_and_Objects.Variant_A.Task_3;

/**
 * Created by Ingener_mobil on 01.11.2016.
 */
public class Patient {
    private String name;
    private int medNumber;
    private Diagnose diagnose;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMedNumber() {
        return medNumber;
    }

    public void setMedNumber(int medNumber) {
        this.medNumber = medNumber;
    }

    public Diagnose getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(Diagnose diagnose) {
        this.diagnose = diagnose;
    }

    public Patient(String name, int medNumber, Diagnose diagnose) {
        this.name = name;
        this.medNumber = medNumber;
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Имя: "+name+" Мед номер: "+medNumber+" Диагноз: "+diagnose.getDiagnose(diagnose));
        return sb.toString();
    }
}
