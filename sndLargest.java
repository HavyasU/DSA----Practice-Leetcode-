import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Validate input
        if (n < 2) {
            System.out.println("Array must contain at least 2 elements.");
            return;
        }

        int[] arr = new int[n];

        // Input: Array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Integer largest = null;
        Integer secondLargest = null;

        // Logic: Find second largest without sorting
        for (int num : arr) {

            if (largest == null || num > largest) {
                secondLargest = largest; 
                largest = num;  
            } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        if (secondLargest == null) {
            System.out.println("No second largest value (all numbers may be equal).");
        } else {
            System.out.println("Second Largest Element: " + secondLargest);
        }

        sc.close();
    }
}
