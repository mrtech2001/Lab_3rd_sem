
// Write a java program to find the largest number among the three numbers.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number to check the largest one:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a != b || b != c || a != c) {
            int leargest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
            System.out.println("The leargest number among these number is: " + leargest);
        } else {
            System.out.println("All are Equal number.");
        }
        sc.close();
    }
}
