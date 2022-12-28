package Worker;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}';
    }

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        terminate("20/02/2021");
        this.isRetired = true;
    }

    public boolean isRetired() {
        return isRetired;
    }

    @Override
    public double collectPay(){
        int yearsActive = Integer.parseInt(terminate("20/02/2021").substring(6)) - Integer.parseInt(getHireDate().substring(6));
        return isRetired? (int) annualSalary / 12 * yearsActive : annualSalary / 12;
    }

}
