package Chapter_3_Class_and_Objects.Variant_A.Task_5;

/**
 * Created by Ingener_mobil on 02.11.2016.
 */
public enum Author {
    LONDON,
    KIPLING,
    KING;

    public String getAuthor(Author a){
        switch (a){
            case LONDON:
                return "Джек Лондон";
            case KIPLING:
                return "Киплинг";
            case KING:
                return "Стивен Кинг";
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}
