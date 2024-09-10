//     1
//    121
//   12321
//  1234321
// 123454321
public class Q3 {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // space printing
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // print digits incresing
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // pring digits decreasing
            for (int m = i - 1; m >= 1; m--) {
                System.out.print(m);
            }
            System.out.println();
        }

    }

}
