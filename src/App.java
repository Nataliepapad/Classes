import BankAccount.BankAccount;
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

        Wall newWall1 = new Wall(2,4);
        System.out.println(newWall1.getArea());

        Wall newWall2 = new Wall(-5,5);
        System.out.println(newWall2.getArea());

        Wall newWall3 = new Wall(0,10);
        System.out.println(newWall3.getArea());

    }
}
