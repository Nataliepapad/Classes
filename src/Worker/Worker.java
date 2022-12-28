package Worker;

import java.util.Calendar;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;


    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return currentYear - birthYear;
    }

    public String getName() {
        return name;
    }

    public double collectPay(){
        return 0.0;
    }


    public String terminate(String endDate){
        return this.endDate = endDate;
    }
}
