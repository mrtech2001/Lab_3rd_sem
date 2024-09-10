
// Write a Java program to compute the distance between two points.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st co-ordinate in terms of (x,y): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter 2nd the co-ordinate in terms of (x,y): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double r1 = (x2 - x1) * (x2 - x1);
        double r2 = (y2 - y1) * (y2 - y1);

        System.out.println("The distance b/w two points is: " + Math.sqrt(r1 + r2));
        sc.close();
    }
}
