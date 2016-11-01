package Chapter_3_Class_and_Objects.Variant_A.Task_3;

/**
 * Created by Ingener_mobil on 01.11.2016.
 */
public enum Diagnose {
    GRIP,
    ORZ,
    PROSTUDA;

    public String getDiagnose(Diagnose d){
        switch (d){
            case GRIP:
                return "Грипп";
            case ORZ:
                return "ОРЗ";
            case PROSTUDA:
                return "Простуда";
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}
