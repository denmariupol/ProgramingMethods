package Chapter_3_Class_and_Objects.Variant_A.Task_2;

import java.util.ArrayList;

/**
 * Created by Ingener_mobil on 01.11.2016.
 */
public class Arr {
    private static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static void addCustomers(){
        customers.add(new Customer(124,"Денис",1254,55875));
        customers.add(new Customer(524,"Игорь",5241,41258));
        customers.add(new Customer(184,"Михаил",8745,54123));
        customers.add(new Customer(174,"Гриша",6589,12365));
        customers.add(new Customer(254,"Юра",1598,85697));
        customers.add(new Customer(454,"Стас",7532,65874));
        customers.add(new Customer(964,"Тарас",8563,45874));
    }
}
