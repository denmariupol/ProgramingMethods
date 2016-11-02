package Chapter_3_Class_and_Objects.Variant_A.Task_5;

/**
 * Created by den on 2016-11-02.
 */
public enum Year{
    FIRST,
    SECOND,
    THIRD;

    public String getYear(Year y){
        switch (y){
            case FIRST:
                return "1987";
            case SECOND:
                return "1995";
            case THIRD:
                return "1892";
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}
