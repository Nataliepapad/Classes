package Composition;

public class Wall {
    private int height;
    private int width;
    private String color;

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Wall(int height, int width) {
        this.height = height;
        this.width = width;
        this.color = "White";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea(){
        return width * height;
    }

    public void paint(){
        setColor("Pink");
        System.out.println("Wall has been painted " + color);
    }
}
