
// Write a java program to add the two numbers.
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hit the value of a: ");
        int a = sc.nextInt();
        System.out.println("Hit the value of b: ");
        int b = sc.nextInt();

        System.out.println("The addition of a & b is: " + (a + b));
        sc.close();
    }
}
