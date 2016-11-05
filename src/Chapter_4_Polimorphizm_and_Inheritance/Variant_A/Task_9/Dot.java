package Chapter_4_Polimorphizm_and_Inheritance.Variant_A.Task_9;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Dot {
    private int x,y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("x="+this.x+" y="+this.y);
        return sb.toString();
    }
    @Override
    public int hashCode(){
        return x * y;
    }

    @Override
    public boolean equals(Object o){
        Dot d = (Dot)o;
        if(this.x == ((Dot) o).x && this.y == ((Dot) o).y)
            return true;
        else
            return false;
    }
}
