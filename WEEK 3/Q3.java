
// Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number to find it's taable up to 10: ");
        int n = sc.nextInt();

        System.out.println("The table are: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * n + "  ");
        }
        sc.close();
    }
}
