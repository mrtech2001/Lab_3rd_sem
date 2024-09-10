
//Write a java program to multiply two floating numbers.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hit the value of a: ");
        float a = sc.nextFloat();
        System.out.println("Hit the value of b: ");
        float b = sc.nextFloat();

        System.out.println("The multiply of these variable is: " + (a * b));
        sc.close();
    }
}
