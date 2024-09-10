
//Write a java program to display a cube of a number.
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's cube: ");
        double a = sc.nextDouble();
        System.out.println("The cube of this number is: " + (a * a * a));
        sc.close();
    }
}
