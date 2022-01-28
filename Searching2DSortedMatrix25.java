package com.company;

import java.util.Arrays;

public class Searching2DSortedMatrix25 {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        } ;
        System.out.println(Arrays.toString(search(arr,10)));
    }
    public static int [] search(int [] [] arr , int target) {
        int row = 0;
        int col = arr.length-1;
        while(row < arr.length && col >= 0 ) {
            if(arr[row][col]==target) {
                return new int [] {row,col};
            }
            if(arr[row][col] < target ) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int [] {-1,-1};
    }
}
