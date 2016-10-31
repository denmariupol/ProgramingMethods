package Chapter_3_Class_and_Objects.Variant_A.Task_1;

public enum Faculty{
    INGINEER,
    PEDAGOGICAL,
    BUILD;
    public String GetFaculty(Faculty f){
        switch (f){
            case INGINEER:
                return "Инженерный";

            case PEDAGOGICAL:
                return "Педагогический";

            case BUILD:
                return "Строительный";

            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}