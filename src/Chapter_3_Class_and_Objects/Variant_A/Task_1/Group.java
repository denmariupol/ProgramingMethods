package Chapter_3_Class_and_Objects.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 31.10.2016.
 */
public enum Group {
    INFORMATICS,
    HISTORY,
    PHYSICS,
    MATERIAL;

    public String GetGroup(Group g){
        switch (g){
            case INFORMATICS:
                return "Информатика";
            case HISTORY:
                return "история";
            case PHYSICS:
                return "Физика";
            case MATERIAL:
                return "Материаловедение";
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}
