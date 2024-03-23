package Algorithms;

import java.util.*;

public class SelectionSort {
    // Time Complexity O(n^2)
    // space Complexity O(1)
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 2, 3, 5 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
