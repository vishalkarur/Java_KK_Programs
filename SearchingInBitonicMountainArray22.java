package com.company;

public class SearchingInBitonicMountainArray22 {
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3  , 5 , 6 , 5 , 4 , 3 , 2, 1 };
        int target = 4;
        System.out.println(ans(arr,target));
    }
    public static int mountain(int [] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end ){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int search(int [] arr , int target , int start , int end ) {
        if(arr[0] <arr[end]) {
            while(start<=end) {
                int mid = start + (end - start) / 2;
                if(target > arr[mid]) {
                    start = mid + 1;
                }
                else if (target < arr[mid]) {
                    end = mid -1;
                }
                else {
                    return mid;
                }
            }
        }
        else {
            while(start<=end) {
                int mid = start + (end - start) / 2;
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else if (target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }

        }
        return -1;
    }

    public static int ans (int [] arr , int target ) {
        int peak = mountain(arr);
        int firsttry = search(arr,target,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return search(arr,target,peak+1, arr.length-1);
    }
}
