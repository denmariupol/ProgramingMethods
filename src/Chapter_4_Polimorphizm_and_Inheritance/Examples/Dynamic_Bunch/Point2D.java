package Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Point2D extends Point1D{
    private int y;
    public Point2D(int x,int y){
        super(x);
        this.y = y;
    }
    public double length(){
        return Math.hypot(super.length(),y);
        /* просто length() нельзя, т.к. метод будет вызывать сам себя, что
        приведет к бесконечной рекурсии и ошибке во время выполнения */
    }
    @Override
    public String toString(){
        return super.toString()+" y="+this.y;
    }
}
