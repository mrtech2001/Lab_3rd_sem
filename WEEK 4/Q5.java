// Write a Java program and compute the sum of the digits of an integer.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to find it's sum: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int lsd = n % 10;
            sum = sum + lsd;
            n = n / 10;
        }
        System.out.println("The sum of this integer is: " + sum);
        sc.close();
    }
}
