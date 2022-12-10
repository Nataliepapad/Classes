package BankAccount;

public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(0000, 0000.00, "New Customer", "New email address", 000000);
        System.out.println("Empty-Default Constructor called");
    }

    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber){
        System.out.println("Account Constructor called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setNumber(int number){
        this.number= number;
    }

    public int getNumber(){
        return this.number;
    }

    public void setBalance(double balance){
        this.balance= balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName= customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email= email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber= phoneNumber;
    }

    public double getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println(depositAmount + " added to your account. New balance= " + this.balance);

    }

    public void withdraw(double withdrawalAmount){
        if(withdrawalAmount > this.balance){
            System.out.println("Non-Sufficient Funds in your account. You have: " + this.balance + "€ remaining");
        } else {
             this.balance -= withdrawalAmount;
             System.out.println(withdrawalAmount + " withdrawn from your account. New balance= " + this.balance);
        }
    }
}
