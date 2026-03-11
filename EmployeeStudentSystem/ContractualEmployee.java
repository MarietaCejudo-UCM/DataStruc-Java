public class ContractualEmployee extends Employee {
   private static final double standardHours = 8;
   private static final double overtimeRate = 1.5;

    public ContractualEmployee(String IDNo, String firstName, String lastName, String position, String department, double hoursWork, double hourlyRate) {
        super(lastName, firstName, IDNo, position, department, hoursWork, hourlyRate);
    }
    
    public double calculateOvertime() {
       if(getHoursWork() > standardHours){
           return (getHoursWork() - standardHours) * getHourlyRate() * overtimeRate;
       } else {
           return 0;
       }
    }
   
   @Override
   public double computeSalary() {
       return (getHoursWork() * getHourlyRate()) + calculateOvertime();
   }

    @Override
    public String displayInfo() {
        return super.displayInfo() + 
               "\nOvertime Pay: " + calculateOvertime();
    }
}