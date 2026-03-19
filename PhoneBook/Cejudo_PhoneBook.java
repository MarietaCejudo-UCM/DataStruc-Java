import java.util.ArrayList;
import java.util.Scanner;

public class Cejudo_PhoneBook {

    static ArrayList<PhoneContact> contactArr = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\nPHONE BOOK MENU");
            System.out.println("1 - Add Contact");
            System.out.println("2 - Update Contact");
            System.out.println("3 - Search Contact");
            System.out.println("4 - Delete Contact");
            System.out.println("5 - Display All Contacts");
            System.out.println("6 - Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addContact();
                    break;

                case 2:
                    updateContact();
                    break;

                case 3:
                    searchContact();
                    break;

                case 4:
                    deleteContact();
                    break;

                case 5:
                    displayAllContacts();
                    break;

                case 6:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Please enter a valid choice");
            }

        } while (choice != 6);
    }

    public static void addContact() {

        System.out.print("First Name: ");
        String first = sc.nextLine();

        System.out.print("Last Name: ");
        String last = sc.nextLine();

        System.out.print("Company: ");
        String company = sc.nextLine();

        System.out.print("Nickname: ");
        String nickname = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        PhoneContact contact = new PhoneContact(first, last, company, nickname, phone, email);

        contactArr.add(contact);

        System.out.println("---------------------------");
        System.out.println("CONTACT ADDED SUCCESSFULLY!.");
        System.out.println("---------------------------");
    }
   
   public static void updateContact() {
   
       System.out.print("Enter full name of contact to update: ");
       String name = sc.nextLine();
   
       for (PhoneContact cont : contactArr) {

           String fullName = cont.firstName + " " + cont.lastName;
   
           if (fullName.equalsIgnoreCase(name)) {
   
               System.out.print("New Phone: ");
               cont.phone = sc.nextLine();
   
               System.out.print("New Email: ");
               cont.emailAddress = sc.nextLine();
   
               System.out.println("--------------------");
               System.out.println("CONTACT UPDATED...");
               System.out.println("--------------------");
               return;
           }
       }
   
       System.out.println("-------------------------");
       System.out.println("CONTACT NOT FOUND.");
       System.out.println("-------------------------");
   }
   
    public static void searchContact() {

       System.out.print("Enter full name to search: ");
       String name = sc.nextLine();
   
       for (PhoneContact cont : contactArr) {
   
           String fullName = cont.firstName + " " + cont.lastName;
   
           if (fullName.equalsIgnoreCase(name)) {
   
               System.out.println("Contact Found:");
               cont.displayContact();
               return;
           }
       }
   
       System.out.println("------------------");
       System.out.println("CONTACT NOT FOUND.");
       System.out.println("------------------");
   }    
   
   public static void deleteContact() {
   
       System.out.print("Enter full name to delete: ");
       String name = sc.nextLine();
   
       for (PhoneContact cont : contactArr) {
   
           String fullName = cont.firstName + " " + cont.lastName;
   
           if (fullName.equalsIgnoreCase(name)) {
   
               contactArr.remove(cont);
               System.out.println("--------------------");
               System.out.println("Contact deleted.");
               System.out.println("--------------------");
               return;
           }
       }
   
       System.out.println("------------------");
       System.out.println("Contact not found.");
       System.out.println("------------------");
   }

    public static void displayAllContacts() {

        if (contactArr.isEmpty()) {
            System.out.println("----------------------");
            System.out.println("No contacts available.");
            System.out.println("----------------------");
            return;
        }

        System.out.println("\n-----------------------------");
        System.out.println("--- CONTACT INFORMATION ----");
        System.out.println("-----------------------------\n");

        for (PhoneContact cont : contactArr) {
            cont.displayContact();
        }
    }
}