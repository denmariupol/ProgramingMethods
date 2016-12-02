package Chapter_11_Threads.Examples.ExecutorService_Callable;

import java.util.ArrayDeque;

/**
 * Created by Ingener_mobil on 02.12.2016.
 */
public class ProductList {
    private static ArrayDeque<String> arr = new ArrayDeque<String>(){
        {
            this.add("Product 1");
            this.add("Product 2");
            this.add("Product 3");
            this.add("Product 4");
            this.add("Product 5");
        }
    };
    public static String getProduct(){
        return arr.poll();
    }
}
