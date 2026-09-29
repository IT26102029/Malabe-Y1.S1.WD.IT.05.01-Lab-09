import java.util.Scanner;

public class IT26102029Lab9Q2 {
    
    // circleArea method to calculate and return the area
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Call the circleArea method and display the result
        double area = circleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}