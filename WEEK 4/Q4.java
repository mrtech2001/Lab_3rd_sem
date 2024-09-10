//Write a java program to find the sum of following series where n is input by the user.
// 1+1/2+1/3+1/4+...............+1/n.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }
        System.out.println("The sum of this series is: " + sum);
        sc.close();
    }
}
