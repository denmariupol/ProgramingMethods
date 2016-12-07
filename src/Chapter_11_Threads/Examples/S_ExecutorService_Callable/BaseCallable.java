package Chapter_11_Threads.Examples.S_ExecutorService_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ingener_mobil on 02.12.2016.
 */
public class BaseCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        String product = ProductList.getProduct();
        String result = null;
        if(product != null)
            result = product+" done";
        else
            result = "product is empty";

        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println(result);
        return result;
    }
}
