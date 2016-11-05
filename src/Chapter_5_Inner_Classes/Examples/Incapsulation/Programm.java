package Chapter_5_Inner_Classes.Examples.Incapsulation;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(125478,"Денис");
        abonent.setTariffPlane("free");
        abonent.obtainPhoneNumber(3,555);
        System.out.println(abonent.toString());
    }
}
