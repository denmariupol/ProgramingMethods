package Chapter_8_Errors_and_Exceptions.Examples.Own_Exceptions;

/**
 * Created by Ingener_mobil on 15.11.2016.
 */
public class CoinLogicException extends Exception{
    public CoinLogicException() {}

    public CoinLogicException(String message) {
        super(message);
    }

    public CoinLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoinLogicException(Throwable cause) {
        super(cause);
    }
}
