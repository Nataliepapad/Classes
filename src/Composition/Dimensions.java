package Composition;

public class Dimensions {
    private int length;
    private int width;

    private Dimensions dimensions;


    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Dimensions(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return width * length;
    }
}
