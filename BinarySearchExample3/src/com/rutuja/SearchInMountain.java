package com.rutuja;

public class SearchInMountain {

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 70, 20, 50, 10};
        int target = 20;

        int result = searchInMountainArray(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the mountain array.");
        }
    }

    public static int searchInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int result = binarySearch(arr, target, 0, peak);

        if (result == -1) {
            // If not found in the left part, search in the right part (after the peak)
            result = binarySearch(arr, target, peak + 1, arr.length - 1);
        }

        return result;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Element not found
    }
}
