package com.company;

public class RotatedBinarySearch23 {
    public static void main(String[] args) {
        int [] arr = {4 , 5 , 6 , 7 , 8 , 0 , 1 , 2 , 3};
        System.out.println(findpivot(arr));
    }
    public static int findpivot(int [] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end-start) / 2;
            if(arr[mid] > arr[mid+1] && mid < end) {
                return mid;
            }
            if(arr[mid-1] > arr[mid] && mid > start) {
                return mid-1;
            }
            if(arr[start] >= arr[mid]) {
                end = mid -1 ;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }
    public static int search(int [] arr , int target) {
        int pivotelement = findpivot(arr);
        if(pivotelement==-1) {
            return binarysearch(arr,target,0,arr.length-1);
        }
        else {
            if(arr[pivotelement]==target) {
                return pivotelement;
            }
            if(target>=arr[0]) {
                return binarysearch(arr,target,0,pivotelement-1);
            }
            else {
                return binarysearch(arr,target,pivotelement+1,arr.length-1);
            }
        }
    }
    public  static int binarysearch(int[] arr, int target , int start , int end ) {
        while(start<=end){
            int mid =  start + (end-start) / 2 ;
            if(arr[mid]>target) {
                end = mid -1;
            }
            else if (arr[mid]<target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
