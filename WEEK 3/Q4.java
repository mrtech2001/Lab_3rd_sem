// Write a Java program to calculate the sum of following series:
// 1 + 2 + 3 + 4 + .......... + N

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hit the value of N : ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println("The sum up to " + N + " is : " + sum);
        sc.close();
    }
}
