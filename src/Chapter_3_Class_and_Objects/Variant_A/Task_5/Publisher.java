package Chapter_3_Class_and_Objects.Variant_A.Task_5;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public enum Publisher {
    PUBLISHER_1,
    PUBLISHER_2,
    PUBLISHER_3;

    public String getPublisher(Publisher p){
        switch (p){
            case PUBLISHER_1:
                return "Издатель №1";
            case PUBLISHER_2:
                return "Издатель №2";
            case PUBLISHER_3:
                return "Издатель №3";
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}
