
// Write a Java program to take a number, divide it by 2 and print the result until the number becomes less than 10.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        double N = sc.nextDouble();

        System.out.println("The result of each step dividing " + N + " by 2 is: ");
        while (N >= 10) {
            N = N / 2;
            System.out.println(N);
        }
        sc.close();
    }
}
