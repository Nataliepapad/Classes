package Inheritance;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int teeth;
    private String coat;

    public Dog(String name, int height, int weight, int eyes, int legs, int teeth, String coat) {
        super(name, 1,1, height, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chew their food");
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(10);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(30);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
