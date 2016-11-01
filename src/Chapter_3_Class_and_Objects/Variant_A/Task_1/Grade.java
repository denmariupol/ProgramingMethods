package Chapter_3_Class_and_Objects.Variant_A.Task_1;

/**
 * Created by Ingener_mobil on 31.10.2016.
 */
public enum Grade {
    FIRST,
    SECOND,
    THIRD,
    FOURTH,
    FIFTH;

    public String GetGrade(Grade c){
        switch (c){
            case FIRST:
                return "1-й курс";
            case SECOND:
                return "2-й курс";
            case THIRD:
                return "3-й курс";
            case FOURTH:
                return "4-й курс";
            case FIFTH:
                return "5-й курс";
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}
