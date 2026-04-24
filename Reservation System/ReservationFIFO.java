import java.util.Scanner;

public class ReservationFIFO {

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
            System.out.println("Persons: " + persons);
            System.out.println("----------------------");
        }
    }
    static int SIZE = 80;
    static Reservation[] queue = new Reservation[80];
    static int front = -1;
    static int rear = -1;

    static Scanner scanner = new Scanner(System.in);
    static int nextReservationNumber = 1;

    // full
    public static boolean isFull() {
        return (front == 0 && rear == SIZE - 1);
    }

    // empty
    public static boolean isEmpty() {
        return (front == -1);
    }

    // enqueue
    public static void enQueue(Reservation element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = element;
            System.out.println("Inserted: " + element.name);
        }
    }

    // dequeue
    public static Reservation deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Reservation element = queue[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }

            System.out.println(element.name + " Deleted");
            return element;
        }
    }

    // display
    public static void displayReservations() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Reservations:");

            for (int i = front; i <= rear; i++) {
                queue[i].display();
            }

            System.out.println("Rear index-> " + rear);
        }
    }

    // add reservation
    public static void addReservation() {
        int number = nextReservationNumber++;
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Date: ");
        String date = scanner.nextLine();

        System.out.print("Enter Persons: ");
        int persons = scanner.nextInt();

        enQueue(new Reservation(number, name, date, persons));
    }

    // cancel reservation
    public static void cancelReservation() {
        Reservation removed = deQueue();
        if (removed != null) {
            System.out.println("Cancelled Reservation:");
            removed.display();
        }
    }

    // menu
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== RESERVATION SYSTEM =====");
            System.out.println("1. Add Reservation");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Display Reservations");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addReservation();
                case 2 -> cancelReservation();
                case 3 -> displayReservations();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid!");
            }

        } while (choice != 4);
    }
}