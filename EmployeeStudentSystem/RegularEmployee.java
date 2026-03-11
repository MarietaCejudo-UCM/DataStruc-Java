public class RegularEmployee extends Employee {
    private double bonus;

    public RegularEmployee(String IDNo, String firstName, String lastName, String position, String department, double hoursWork, double hourlyRate, double bonus) {
        super(lastName, firstName, IDNo, position, department, hoursWork, hourlyRate);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double computeSalary() {
        return (getHoursWork() * getHourlyRate()) + bonus;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + 
               "\nBonus: " + bonus;
    }
}  