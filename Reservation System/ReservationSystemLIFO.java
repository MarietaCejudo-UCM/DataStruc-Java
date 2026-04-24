import java.util.Scanner;

public class ReservationSystemLIFO {

    static class Reservation {
        int reservationNumber;
        String name;
        String date;
        int persons;

        public Reservation(int reservationNumber, String name, String date, int persons) {
            this.reservationNumber = reservationNumber;
            this.name = name;
            this.date = date;
            this.persons = persons;
        }

        public void display() {
            System.out.println("Reservation No: " + reservationNumber);
            System.out.println("Name: " + name);
            System.out.println("Date: " + date);
            System.out.println("Number of Persons: " + persons);
            System.out.println("------------------------------");
        }
    }

    static Reservation[] stack = new Reservation[80];
    static int top = -1;
    
    static Scanner scanner = new Scanner(System.in);
    static int nextReservationNumber = 1;


    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== RESERVATION SYSTEM =====");
            System.out.println("1. Add Reservation");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Display All Reservations");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addReservation();
                case 2 -> cancelReservation();
                case 3 -> displayReservations();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
    
    public static boolean isEmpty() {
       return top == -1;
    }
   
   public static boolean isFull() {
       return top == stack.length - 1;
   }

    public static void addReservation() {
        int number = nextReservationNumber;
        nextReservationNumber++;

        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Date: ");
        String date = scanner.nextLine();

        System.out.print("Enter Number of Persons: ");
        int numPersons = scanner.nextInt();

        if (isFull()) {
            System.out.println("STACK IS FULL! Cannot add more reservations.");
            return;
        }

        top++;
        stack[top] = new Reservation(number, name, date, numPersons);

        System.out.println("==============================");
        System.out.println("RESERVATION ADDED SUCCESSFULLY");
        System.out.println("Reservation Number: " + number);
        System.out.println("==============================");
    }

    public static void cancelReservation() {
        if (isEmpty()) {
            System.out.println("===========================");
            System.out.println("NO RESERVATION TO CANCEL");
            System.out.println("===========================");
            return;
        }
        
        Reservation removed = stack[top];
        top--;

        System.out.println("==============================");
        System.out.println("CANCELLED LATEST RESERVATION");
        System.out.println("==============================");
        removed.display();
    }

    public static void displayReservations() {
        if (isEmpty()) {
            System.out.println("================");
            System.out.println("NO RESERVATIONS");
            System.out.println("================");
            return;
        }

        System.out.println("\n--- ALL RESERVATIONS (LATEST FIRST) ---");

        for (int i = top; i >= 0; i--) {
            stack[i].display();
        }
    }
}