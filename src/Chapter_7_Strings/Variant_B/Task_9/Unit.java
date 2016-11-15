package Chapter_7_Strings.Variant_B.Task_9;

/**
 * Created by Ingener_mobil on 11.11.2016.
 */
public abstract class Unit {
    private char c;
    private char punct;
    private String word;
    private int dimension;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setPunct(char punct) {
        this.punct = punct;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public char getC() {
        return c;
    }
    public String getWord() {
        return word;
    }
    public char getPunct() {
        return punct;
    }
}
