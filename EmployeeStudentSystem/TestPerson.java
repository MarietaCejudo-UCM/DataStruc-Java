public class TestPerson {
    public static void main(String[] args) {

        RegularEmployee regularEmployee = new RegularEmployee
        ("0008", "Aurora", "Smith", "Graphics Designer", "Design", 8, 80, 500); 
       
        ContractualEmployee contractualEmployee = new ContractualEmployee
        ("00013", "Jen", "Rubyjane", "Data Scientist", "Data Science", 9, 60);
       
        Student student = new Student
        ("24952244", "Sofia", "The First", "Computer Science", "Engineering");
         
        System.out.println("\n------------ Regular Employee Info -----------\n"
                           + regularEmployee.displayInfo());
        System.out.println("Salary: $" + regularEmployee.computeSalary());

        System.out.println("\n----------Contractual Employee Info -----------\n"
                           + contractualEmployee.displayInfo());
        System.out.println("Salary: $" + contractualEmployee.computeSalary());

        System.out.println("\n------- STUDENT INFORMATION ------------\n"
                           + student.displayInfo());
    }
} 