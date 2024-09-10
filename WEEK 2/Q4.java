
// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        double b = sc.nextDouble();
        System.out.println("Enter 3rd number: ");
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("The cube of this number is: " + avg);
        sc.close();
    }
}
