
// Write a program to reverse a given string.
import java.util.Scanner;

public class Q4 {
    public static void ReverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse:");
        String s = sc.nextLine();

        // reverse string code
        System.out.println("The reverse of this string is: ");
        ReverseString(s);
        sc.close();
    }
}
