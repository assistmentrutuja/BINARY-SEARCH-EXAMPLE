package com.rutuja;

public class Peak {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 40, 60, 70, 20, 50, 10};
        
        int asn = peakIndexInMountainArray(arr1);
        System.out.println(asn);
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
        return end;
    }
}
