// Write a Java program to implement binary search.

public class Q1 {

    public static int binarySearch(int arr[], int target, int si, int ei) {
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                si = mid + 1; // Search in the right half
            } else {
                ei = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 2, 9, 1 };
        int target = 2;
        int index = binarySearch(arr, target, 0, arr.length - 1);

        if (index != -1) {
            System.out.println("The index of the target is: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
