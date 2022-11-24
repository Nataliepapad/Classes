import BankAccount.BankAccount;
import CarpetCostCalculator.Calculator;
import CarpetCostCalculator.Carpet;
import CarpetCostCalculator.Floor;
import ComplexOperations.ComplexNumber;
import Composition.Dimensions;
import Composition.Furniture;
import Composition.Room;
import Composition.Window;
import CompositionExercise.Bed;
import CompositionExercise.Bedroom;
import CompositionExercise.Ceiling;
import CompositionExercise.Lamp;
import Encapsulation.Printer;
import Inheritance.Animal;
import Inheritance.Circle.Circle;
import Inheritance.Circle.Cylinder;
import Inheritance.Dog;
import Inheritance.Fish;
import Inheritance.Rectangle.Cuboid;
import Inheritance.Rectangle.Rectangle;
import VipCustomer.VipCustomer;
import WallArea.Wall;

public class App {
    public static void app(){
        BankAccount myAccount = new BankAccount(123456, 200,"Natalie Papadatou",
                "myemail@gmail.com",8006182);
        System.out.println(myAccount.getNumber());

        BankAccount newBankAccount = new BankAccount();
        System.out.println(newBankAccount.getCustomerName());

        myAccount.deposit(200);
        myAccount.withdraw(400);

        myAccount.deposit(1000);
        myAccount.withdraw(400);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCreditLimit());

        VipCustomer person2 = new VipCustomer("Nathalie" , 1500);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("George", 20000, "george@email.com");
        System.out.println(person3.getEmail());

        System.out.println("_____________________________________");

        Wall newWall1 = new Wall(2,4);
        System.out.println(newWall1.getArea());

        Wall newWall2 = new Wall(-5,5);
        System.out.println(newWall2.getArea());

        Wall newWall3 = new Wall(0,10);
        System.out.println(newWall3.getArea());


        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total cost= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total cost= " + calculator.getTotalCost());

        System.out.println("_____________________________________");

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        System.out.println("_____________________________________");

        Animal animal = new Animal("Zebra", 1, 1, 170, 65);
        Dog dog = new Dog("Pitbull", 1, 30,2,4,20,"short fur");
        dog.eat();
        Fish fish = new Fish("Nemo", 10, 2, 2, 8, 100);
        fish.move(15);
        fish.swim(15);

        System.out.println("_____________________________________");

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("_____________________________________");

        Composition.Wall bedroomWall = new Composition.Wall(20,15);
        Window bedroomWindow = new Window(3);
        Furniture bedroomFurniture = new Furniture("Bed");
        Dimensions bedroomDimensions = new Dimensions(20, 30);
        bedroomDimensions.getArea();
        Room bedroom = new Room("Bedroom", bedroomWall, bedroomWindow, bedroomFurniture, bedroomDimensions);

        bedroom.openWindows();
        bedroom.paintWall();

        System.out.println("_____________________________________");

        CompositionExercise.Wall wall1 = new CompositionExercise.Wall("West");
        CompositionExercise.Wall wall2 = new CompositionExercise.Wall("East");
        CompositionExercise.Wall wall3 = new CompositionExercise.Wall("South");
        CompositionExercise.Wall wall4 = new CompositionExercise.Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom newBedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        newBedroom.makeBed();

        newBedroom.getLamp().turnOn();

        System.out.println("_____________________________________");

        Printer printer = new Printer(50, true);
        printer.fillUpToner(30);
        System.out.println("New toner level is: "+ printer.getTonerLevel());

        printer.fillUpToner(30);
        printer.printPages(31);
        printer.printPages(13);

        Printer printer2 = new Printer(50, false);
        printer2.fillUpToner(50);
        System.out.println("New toner level is: "+ printer2.getTonerLevel());

        printer2.printPages(31);
        printer2.printPages(10);
    }
}
