package Worker;

public class Employee extends Worker{
    private long employeeId;
    private static int employeeNo = 1;

    public String getHireDate() {
        return hireDate;
    }

    private String hireDate;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }
}
