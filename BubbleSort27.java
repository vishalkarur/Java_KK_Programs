package com.company;

import java.util.Arrays;

public class BubbleSort27 {
    public static void main(String[] args) {
        int [] arr = {50 , 40 , 30 , 20 , 10} ;
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort (int [] arr) {
        boolean swapped ;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false) {
                break;
        }
        }
    }
}
