package Chapter_5_Inner_Classes.Examples.Incapsulation;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Abonent {
    private long id;
    private String name;
    private String tariffPlane;
    private PhoneNumber phoneNumber;

    public Abonent(long id, String name) {
        this.id = id;
        this.name = name;
    }

    private class PhoneNumber{
        private int countryCode;
        private int netCode;
        private int number;

        public void setCountryCode(int countryCode) {
            this.countryCode = countryCode;
        }

        public void setNetCode(int netCode) {
            this.netCode = netCode;
        }
        public int generateNumber(){
            return number = new java.util.Random().nextInt(1000000);
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTariffPlane() {
        return tariffPlane;
    }

    public void setTariffPlane(String tariffPlane) {
        this.tariffPlane = tariffPlane;
    }

    public String getPhoneNumber() {
        if(phoneNumber != null)
            return ("+"+phoneNumber.countryCode+"-"+phoneNumber.netCode+"-"+phoneNumber.number);
        else
            return ("Phone number is empty");
    }

    public void obtainPhoneNumber(int countryCode,int netCode){
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(100);
        sb.append("Abonent '" +name+ "':\n");
        sb.append(" ID - " + id +"\n");
        sb.append(" Tariff plan - " + tariffPlane + "\n");
        sb.append(" Phone number - " + getPhoneNumber() + "\n");
        return sb.toString();
    }
}
