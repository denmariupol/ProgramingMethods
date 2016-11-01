package Chapter_3_Class_and_Objects.Variant_A.Task_2;

/**
 * Created by Ingener_mobil on 01.11.2016.
 */
public class Customer implements Comparable<Customer>{
    private Integer id;
    private String name;
    private Integer creditNumber;
    private Integer bankNumber;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCreditNumber() {
        return creditNumber;
    }
    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }
    public int getBankNumber() {
        return bankNumber;
    }
    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public Customer(Integer id, String name, Integer creditNumber, Integer bankNumber) {
        this.id = id;
        this.name = name;
        this.creditNumber = creditNumber;
        this.bankNumber = bankNumber;
    }
    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder("ID: "+this.id+" Name: "+this.getName()+" Credit number: "+this.getCreditNumber()+" Bank number: "+this.getBankNumber());
        return sb.toString();
    }

    @Override
    public int compareTo(Customer c){
        return this.name.compareTo(c.name);
    }
}
