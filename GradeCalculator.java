import java.util.ArrayList;

public class GradeCalculator {
    private ArrayList<Integer> points; // List to store points
    private ArrayList<Integer> grades; // List to store corresponding grades

    // Constructor to initialize ArrayLists
    public GradeCalculator(){
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Method to add points and corresponding grades to the ArrayLists
    public void addPoints(int point){
        // Check if point is within valid range
        if(point >= 0 && point <= 100){
            points.add(point); // Add point to points ArrayList
            this.grades.add(pointsToGrades(point)); // Convert point to grade and add to grades ArrayList
        }
    }

    // Method to calculate the sum total of all points
    public int sumOfPoints(){
        int count = 0;
        // Iterate through points ArrayList and sum up all points
        for(int points : points){
            count += points;
        }
        return count; // Return the sum total
    }

    // Method to return the number of entries in the points ArrayList
    public int numberOfPoints(){
        return points.size(); // Return the size of the points ArrayList
    }

    // Method to return the number of grades matching a specific grade
    public int numberOfGrades(int grade){
        int count = 0;
        // Iterate through grades ArrayList and count occurrences of the specified grade
        for (int received : this.grades){
            if (received == grade){
                count++;
            }
        }
        return count; // Return the count of occurrences
    }

    // Method to calculate the average of all points
    public int average(){
        // Check if there are no points added yet
        if(numberOfPoints() == 0){
            return 0; // Return 0 or handle this case accordingly
        }
        return sumOfPoints() / numberOfPoints(); // Calculate and return the average
    }

    // Method to calculate the total of passing grades
    public int passingTotal(){
        int total = 0;
        // Iterate through points ArrayList and sum up all passing grades (points >= 50)
        for(int passing : points){
            if(passing >= 50){
                total += passing;
            }
        }
        return total; // Return the total of passing grades
    }

    // Method to calculate the number of passing grades
    public int passingSize(){
        int size = 0;
        // Iterate through points ArrayList and count the number of passing grades (points >= 50)
        for(int passing : points){
            if(passing >= 50){
                size++;
            }
        }
        return size; // Return the number of passing grades
    }

    // Method to calculate the average of passing grades
    public String passingTotalAvg(){
        int total = 0;
        int size = 0;
        // Iterate through points ArrayList and sum up passing grades and count their occurrences
        for(int passing : points){
            if(passing >= 50){
                total += passing;
                size++;
            }
        }
        if(size == 0){
            return "-"; // Handle the case when there are no passing grades
        } else {
            return String.valueOf(total/size); // Calculate and return the average of passing grades
        }
    }

    // Method to calculate the percentage of passing grades
    public double passPercent(){
        // Check if there are passing grades
        if(passingSize() > 0){
            // Calculate and return the percentage of passing grades
            return 100 * ((double) passingSize() / (double) numberOfPoints());
        } else {
            return 0; // Return 0 if there are no passing grades
        }
    }

    // Method to convert points to grades
    public static int pointsToGrades(int points){
        int grade = 0;
        // Determine the grade based on the points
        if(points < 50){
            grade = 0;
        } else if (points < 60){
            grade = 1;
        } else if (points < 70){
            grade = 2;
        } else if (points < 80){
            grade = 3;
        } else if (points < 90){
            grade = 4;
        } else {
            grade = 5;
        }
        return grade; // Return the corresponding grade
    }
}
