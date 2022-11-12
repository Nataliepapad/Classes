package Inheritance;

public class Fish extends Animal{
    private int eyes;
    private int gills;
    private int fins;

    public Fish(String name, int height, int weight, int eyes, int gills, int fins) {
        super(name, 1,1, height, weight);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() called");

    }

    private void moveBackFin(){
        System.out.println("Fish.moveBackFin() called");

    }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
