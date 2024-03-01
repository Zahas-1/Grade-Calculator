import java.util.Scanner;
public class GradeUI {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner s = new Scanner(System.in);

        // Create a new GradeCalculator object to perform grade calculations
        GradeCalculator gcc = new GradeCalculator();

        // Create a new GradeInterface object to interact with the GradeCalculator and Scanner objects
        GradeInterface gc = new GradeInterface(gcc, s);

        // Start the grade interface
        gc.start();
    }
}
