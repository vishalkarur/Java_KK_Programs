import java.util.Arrays;

public class CelingFloorArray17 {
    public static void main(String [] args) {
        int [] arr = { 1,  3, 5, 8 , 9 , 13 , 15 , 18 , 21};
        int target = 14;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int []search(int[] arr, int target) {
        if(target > arr[arr.length-1]) {
            return new int []{-1,-1};
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > target) {
                end = mid -1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
        
        }
        return new int [] {start ,arr[start]};//celing
    }
    
}
