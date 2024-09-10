
// Write a Java program to implement linear search.
import java.util.Scanner;

public class Q6 {
    public static void Search(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println("The element is present in this Array.");
                return;
            }
        }
        System.out.println("The element is absent.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the size of an Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.err.println("Fill the elements to the Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter an element that you want to search: ");
        int k = sc.nextInt();
        Search(arr, k);

        sc.close();
    }
}