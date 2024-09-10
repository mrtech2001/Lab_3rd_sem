
// Write a java program to check whether the given number is odd or even.
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to check odd or even:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("This is an Even number.");
        } else {
            System.out.println("This is an Odd number.");
        }
        sc.close();
    }
}
