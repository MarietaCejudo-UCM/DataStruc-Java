import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // bride information
        System.out.print("Enter bride's first name: ");
        String brideFirstName = scanner.nextLine();
        System.out.print("Enter bride's last name: ");
        String brideLastName = scanner.nextLine();
        Person bride = new Person(brideFirstName, brideLastName);

        // groom information
        System.out.print("Enter groom's first name: ");
        String groomFirstName = scanner.nextLine();
        System.out.print("Enter groom's last name: ");
        String groomLastName = scanner.nextLine();
        Person groom = new Person(groomFirstName, groomLastName);

        Couple couple = new Couple(bride, groom);

        // wedding date
        System.out.print("Enter Wedding Date (MM/DD/YYYY): ");
        String date = scanner.nextLine();

        // wedding location
        System.out.print("Enter wedding location: ");
        String location = scanner.nextLine();

        Wedding wedding = new Wedding(couple, date, location);

        // wedding details
        System.out.println("\n--- Wedding Details ---");
        System.out.println("Bride: " + wedding.getCouple().getBride().getFirstName() + " " +
                           wedding.getCouple().getBride().getLastName());
        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName() + " " +
                           wedding.getCouple().getGroom().getLastName());
        System.out.println("Date: " + wedding.getDate());
        System.out.println("Location: " + wedding.getLocation());
        
        System.out.println("-----------------------");
        System.out.println("Congratulations to Mr & Mrs. " + groomLastName + "!!");

        scanner.close();
    }
}
