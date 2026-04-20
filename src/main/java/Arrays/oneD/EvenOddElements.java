package Arrays.oneD;

import java.util.Scanner;

public class EvenOddElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // Length of array
            int evenCount = 0;
            int oddCount = 0;

            // Count even and odd elements in the array
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Calculate the absolute difference
            int absoluteDifference = Math.abs(evenCount - oddCount);
            System.out.println(absoluteDifference);
        }

        scanner.close();

    }

}
