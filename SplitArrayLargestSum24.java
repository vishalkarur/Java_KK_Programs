package com.company;

public class SplitArrayLargestSum24 {
    public static void main(String[] args) {
        int [] arr = { 7 , 2 , 5 , 10 , 8};
        System.out.println(splitarray(arr,2));

    }
    public static int splitarray(int [] arr , int m ) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]);
            end = end + arr[i];
        }

        while(start < end) {
            int mid =  start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for(int num : arr) {
                if(sum + num > mid) {
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
        if(pieces > m) {
            start = mid + 1;
        }
        else {
            end = mid;
        }
        }
        return end;
    }
}
