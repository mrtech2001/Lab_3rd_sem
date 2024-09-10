// Write a program to check whether a given string is palindrome or not.

import java.util.Scanner;

public class Q5 {
    public static boolean isPalindrom(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) == s.charAt(j)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to Palindrome:");
        String s = sc.nextLine();
        if (isPalindrom(s)) {
            System.out.println("This is palindrome.");
        } else {
            System.out.println("This is not palindrom.");
        }
        sc.close();
    }
}
