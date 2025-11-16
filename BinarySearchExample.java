import java.util.*;

public class BinarySearchExample {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, right, target);
        } else {
            return binarySearchRecursive(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 5, 8, 12, 16, 23, 38 };
        int target = 16;

        int iterativeResult = binarySearchIterative(numbers, target);
        int recursiveResult = binarySearchRecursive(numbers, 0, numbers.length - 1, target);

        System.out.println("Iterative Result: " + iterativeResult);
        System.out.println("Recursive Result: " + recursiveResult);
    }
}
