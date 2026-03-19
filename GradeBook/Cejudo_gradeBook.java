public class Cejudo_gradeBook {
    public static void main(String[] args) {
        int[][] scores = {
            {87, 96, 70, 80},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 65, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 84},
            {87, 93, 73}
        };

        int numberOfTests = scores[0].length;

        int lowest = 100; 
        int highest = 0;

        System.out.println("Welcome to the grade book for CS101 Introduction to C++ Programming!");
        System.out.println("The grades are:");

        System.out.printf("%-10s", "Student"); 
        for (int i = 1; i <= numberOfTests; i++) {
            System.out.printf("%8s", "Test " + i); // each test column is 8 spaces wide
        }
        System.out.printf("%10s%n", "Average"); // average column is 10 spaces wide

        // Print each student's scores
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int min = 100;
            int max = 0;

            System.out.printf("%-10s", "Student " + (i + 1)); // left-align student label
            for (int score : scores[i]) {
                System.out.printf("%8d", score); // right-align scores in 8 spaces
                sum += score;
                if (score < min) min = score;
                if (score > max) max = score;
            }

            double average = (double) sum / scores[i].length;
            System.out.printf("%10.2f%n", average); // average with 2 decimals

            if (min < lowest) lowest = min;
            if (max > highest) highest = max;
        }

        System.out.println("\nLowest grade in the grade book is " + lowest);
        System.out.println("Highest grade in the grade book is " + highest);
    }
}