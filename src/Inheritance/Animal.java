package Inheritance;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Animal(String name, int brain, int body, int height, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.height = height;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called;");
    }

    public void move(int speed){
        System.out.println("Animal is moving at: " + speed + " speed");
    };
}
