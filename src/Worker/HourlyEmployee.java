package Worker;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    private void getDoublePay(){
        this.hourlyPayRate = hourlyPayRate * 2;
    }
}
