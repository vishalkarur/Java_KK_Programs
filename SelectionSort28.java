package com.company;

import java.util.Arrays;

public class SelectionSort28 {
    public static void main(String[] args) {
        int [] arr = {50,40,30,19 ,20,10 , 9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int [] arr , int first , int second) {
        int temp =  arr[first];
        arr[first] =  arr[second];
        arr[second] =  temp;
    }
    public static int getmaxindex(int [] arr , int start , int end ) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    public static void selection (int [] arr ) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = getmaxindex(arr,0,last);
            swap(arr,maxindex,last);

        }
    }
}
