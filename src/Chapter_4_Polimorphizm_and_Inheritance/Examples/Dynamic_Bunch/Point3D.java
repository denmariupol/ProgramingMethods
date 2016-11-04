package Chapter_4_Polimorphizm_and_Inheritance.Examples.Dynamic_Bunch;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Point3D extends Point2D{
    private int z;
    public Point3D(int x,int y,int z){
        super(x,y);
        this.z = z;
    }
    public Point3D(){
        this(1,1,1);
    }
    public double length(){
        return Math.hypot(super.length(),z);
    }
    public String toString(){
        return  super.toString()+" z="+this.z;
    }
}
