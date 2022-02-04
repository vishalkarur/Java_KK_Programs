package com.company;

import java.util.Arrays;

public class CyclicSort30 {
    public static void main(String[] args) {
        int [] arr = {4 , 5 , 3 , 2 , 6 ,  1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void swap(int [] arr , int first , int second ) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cyclic_sort (int [] arr) {
        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i]-1;
            if(arr[correctindex]!=arr[i]){
                swap(arr,i,correctindex);
            }
            else {
                i++;
            }
        }
    }
}
