package Composition;

public class Room {
    private String name;
    private Wall wall;
    private Window window;
    private Furniture furniture;
    private Dimensions dimensions;

    public Room(String name, Composition.Wall wall, Window window, Furniture furniture, Dimensions dimensions) {
        this.name = name;
        this.wall = wall;
        this.window = window;
        this.furniture = furniture;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public void openWindows(){
        window.open();
    }

    public void paintWall(){
        wall.paint();
    }
}
