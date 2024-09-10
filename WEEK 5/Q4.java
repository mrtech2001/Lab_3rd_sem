
// Write a Java program to find the maximum and minimum among array elements.
import java.util.Scanner;

public class Q4 {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int Maxi(int arr[]) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int Mini(int arr[]) {
        int Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Min > arr[i]) {
                Min = arr[i];
            }
        }
        return Min;

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

        System.out.println("Maximum no:" + Maxi(arr));
        System.out.println("Maximum no:" + Mini(arr));
        sc.close();
    }
}