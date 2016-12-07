package Chapter_11_Threads.Examples.N_ResourcePool;

/**
 * Created by Ingener_mobil on 28.11.2016.
 * Класс ResourceException желателен в такого рода задачах, чтобы точно описать возникающую проблему при работе ресурса,
 * используемого конкурирующими потоками.
 */
public class ResourсeException extends Exception {
    public ResourсeException() {
        super();
    }
    public ResourсeException(String message, Throwable cause) {
        super(message, cause);
    }
    public ResourсeException(String message) {
        super(message);
    }
    public ResourсeException(Throwable cause) {
        super(cause);
    }
}