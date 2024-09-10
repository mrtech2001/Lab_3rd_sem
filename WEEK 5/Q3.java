
// Write a Java program to swap the first and last elements of an array.
import java.util.Scanner;

public class Q3 {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Fill the Elements in the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // swap array
        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;
        print(arr);
        sc.close();
    }
}
