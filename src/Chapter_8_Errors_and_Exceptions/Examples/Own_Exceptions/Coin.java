package Chapter_8_Errors_and_Exceptions.Examples.Own_Exceptions;

/**
 * Created by Ingener_mobil on 15.11.2016.
 */
public class Coin {
    private double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) throws CoinLogicException{
        if(diameter < 0)
            throw new CoinLogicException("Diameter is incorrect");
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
