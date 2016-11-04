package Chapter_4_Polimorphizm_and_Inheritance.Examples.Constructors;

/**
 * Created by Ingener_mobil on 04.11.2016.
 */
public class Point3D extends Point2D{
    private int z;
    Point3D(int x,int y,int z){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    Point3D(){
        this(-1,1,1);
    }
    @Override
    public String toString(){
        String s = "x="+super.getX()+" y="+super.getY()+" z="+this.getZ();
        return s.toString();
    }
}
