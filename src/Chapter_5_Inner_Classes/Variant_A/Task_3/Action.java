package Chapter_5_Inner_Classes.Variant_A.Task_3;

/**
 * Created by Ingener_mobil on 06.11.2016.
 */
public enum Action {
    CASHIN,
    CASHOUT,
    PAYMENT;

    public String getAction(Action a){
        switch (a){
            case CASHIN:
                return "Поступление";
            case  CASHOUT:
                return "Снятие";
            case PAYMENT:
                return "Оплата";
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}
