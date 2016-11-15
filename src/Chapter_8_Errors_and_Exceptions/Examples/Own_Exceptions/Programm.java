package Chapter_8_Errors_and_Exceptions.Examples.Own_Exceptions;

/**
 * Created by Ingener_mobil on 15.11.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Coin coin = new Coin();
        try {
            coin.setDiameter(-2);
        } catch (CoinLogicException e) {
            e.printStackTrace();
        }
    }
}
