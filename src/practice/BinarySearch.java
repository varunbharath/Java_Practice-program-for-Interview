package practice;

public class BinarySearch {

    public static int binarySearch(int arr[], int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller than mid, it must be in the left subarray
            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }

            // Otherwise, the target must be in the right subarray
            return binarySearch(arr, mid + 1, right, target);
        } 

        // Target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 8, 9, 10, 40}; // Sorted array
        int target = 10;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
