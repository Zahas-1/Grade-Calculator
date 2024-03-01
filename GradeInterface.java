import java.util.Scanner;

public class GradeInterface {
    private GradeCalculator gc; // Reference to the GradeCalculator object
    private Scanner s; // Scanner object for user input

    // Constructor to initialize GradeInterface with GradeCalculator and Scanner objects
    public GradeInterface(GradeCalculator gc, Scanner s){
        this.gc = gc; // Assign the GradeCalculator object
        this.s = s; // Assign the Scanner object
    }

    // Method to start the grade interface
    public void start(){
        readPoints(); // Read points from user input
        System.out.println(""); // Print a blank line for formatting
        printGradeDistribution(); // Print the grade distribution
    }

    // Method to read points from user input
    public void readPoints(){
        while(true){
            System.out.println("Enter points total, -1 stops: "); // Prompt the user to enter points
            String user = s.nextLine(); // Read user input
            if(user.equals("-1")){
                break; // Exit the loop if user enters -1
            } else {
                gc.addPoints(Integer.parseInt(user)); // Add points to the GradeCalculator object
            }
        }
        // Print statistics
        System.out.println("Points average (all): " + gc.average()); // Print average points
        System.out.println("Passing average (all): " + gc.passingTotalAvg()); // Print average of passing grades
        System.out.print("Pass percentage: " + gc.passPercent()); // Print percentage of passing grades
    }

    // Method to print stars based on a number
    public static void printStars(int stars){
        while(stars > 0){
            System.out.print("*"); // Print a star
            stars--; // Decrement the number of stars to print
        }
    }

    // Method to print grade distribution
    public void printGradeDistribution(){
        int grade = 5; // Start from the highest grade
        System.out.println("Grade distribution: "); // Print heading for grade distribution
        while(grade >= 0){
            int stars = gc.numberOfGrades(grade); // Get the number of grades for the current grade
            System.out.print(grade + ": "); // Print the grade
            printStars(stars); // Print stars representing the number of grades
            System.out.println(""); // Move to the next line for the next grade
            grade--; // Move to the next grade
        }
    }
}
