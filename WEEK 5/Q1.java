// Write a Java program to print the odd numbers from 1 to 99.

public class Q1 {
    public static void main(String[] args) {
        int n = 99;
        for (int i = 1; i <= n; i = i + 2) {
            if ((i % 2) != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
