public class Student extends Person {
    private String IDNo;
    private String course;
    private String department;

    public Student(String IDNo, String firstName, String lastName, String course, String department) {
        super(lastName, firstName);
        this.IDNo = IDNo;
        this.course = course;
        this.department = department;
    }

    public String getIDNo() {
        return IDNo;
    }

    public void setIDNo(String IDNo) {
        this.IDNo = IDNo;
    }
   
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String displayInfo() {
        return "ID: " + IDNo + 
               "\nName: " + getFullName() + " " + 
               "\nCourse: " + course + 
               "\nDepartment: " + department;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}   