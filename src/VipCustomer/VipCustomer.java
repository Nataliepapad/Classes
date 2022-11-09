package VipCustomer;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit,"default@email.com");
    }

    public VipCustomer(){
        this("Default name", 10000, "default@email.com");
        System.out.println("Empty Constructor");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
