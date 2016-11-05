package Chapter_4_Polimorphizm_and_Inheritance.Variant_A.Task_9;

/**
 * Created by Ingener_mobil on 05.11.2016.
 */
public class Circle extends Dot{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(Dot dot, int radius) {
        super(dot.getX(),dot.getY());
        this.radius = radius;
    }

    public void setDimension(int x, int y, int radius) {
        super.setX(x);
        super.setY(y);
        this.radius = radius;
    }

    public boolean isLayIn(Dot d){
        double r = Math.sqrt(Math.pow((super.getX() - d.getX()),2)+Math.pow((super.getY() - d.getY()),2));
        if(r > radius) return false;
        else return true;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString()+" radius="+radius);
        return sb.toString();
    }
    @Override
    public int hashCode(){
        return super.getX() * super.getY() * radius;
    }
    public boolean equals(Object o){
        Circle c = (Circle)o;
        if(super.getX() == ((Circle) o).getX() && super.getY() == ((Circle) o).getY() &&
                radius == ((Circle) o).getRadius()) return true;
        else return false;
    }
}
