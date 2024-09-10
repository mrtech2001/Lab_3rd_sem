// Write a Java program to arrange the elements of an array in ascending order (Sorting).
public class Q2 {
    public static void quick_sort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }
        int pivot_idx = Partition(arr, si, ei);
        quick_sort(arr, si, pivot_idx - 1);
        quick_sort(arr, pivot_idx + 1, ei);
    }

    public static int Partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            // make space for elements which are smaller than pivot
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // swap the pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 7, 9, 1, 2 };
        System.out.println("The Acending sorting of the elements:");
        quick_sort(arr, 0, arr.length - 1);
        print(arr);

    }
}
