package practice;

import java.util.Iterator;

public class Bubblesort {
	public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 64, 63, 32, 56};
        System.out.println("Original array:");

        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();

        bubbleSort(arr);
        System.out.println("Sorted array:");

        for (int num : arr) {
            System.out.println(num);
        }
    }
}