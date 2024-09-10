// Write a Java program to calculate the factorial of a number.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer to find it's factorial: ");
        int n = sc.nextInt();
        int fac = 1;
        if (n < 0) {
            System.out.println("Enter an possitive Integer!");
        } else if (n == 1 || n == 0) {
            System.out.println("The Factorial is: 1");
        } else {
            for (int i = 2; i <= n; i++) {
                fac = fac * i;
            }
            System.out.println("The Factorial is: " + fac);
        }
        sc.close();
    }
}