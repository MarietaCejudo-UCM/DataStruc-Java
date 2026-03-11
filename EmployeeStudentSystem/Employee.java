public class Employee extends Person implements ICompute {
    private String IDNo;
    private String position;
    private String department;
    private double hoursWork;
    private double hourlyRate;

    public Employee(String firstName, String lastName, String IDNo, String position, String department, double hoursWork, double hourlyRate) {
        super(lastName, firstName);
        this.IDNo = IDNo;
        this.position = position;
        this.department = department;
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    } 

    public String getIDNo() {
        return IDNo;
    }

    public void setIDNo(String IDNo) {
        this.IDNo = IDNo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(double hoursWork) {
        this.hoursWork = hoursWork;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary(){
      return (getHoursWork() * getHourlyRate()); 
    }

    @Override
    public String displayInfo() {
        return "ID: " + IDNo + 
               "\nName: " + getFirstName() + " " + getLastName() + 
               "\nPosition: " + position + 
               "\nDepartment: " + department;
    }
}