import java.util.Arrays;

public class ContinousArrayIndexes19 {
    public static void main(String [] args) {
        int [] arr = {5 , 7 ,7 ,7 ,7 , 7 , 8 , 8,10};
        int target = 7;
        System.out.println(Arrays.toString(index(arr, target)));
        
    }
    public static int  search(int[] arr, int target , boolean firstindex) {
        int start = 0;
        int end = arr.length-1;
        int ans =0;
        while(start<=end) {
            int mid =  start + (end-start) / 2;
            if(arr[mid] > target) {
                end = mid -1;
            }
            else if (arr[mid] < target ){
                start = mid + 1;
            }
            else {
                ans= mid;
                if(firstindex) {
                    end = mid-1;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return ans;  
    }
    public static int [] index(int [] arr , int target ) {
        int [] ans = {-1,-1};
        ans[0] = search(arr, target,true) ;
        ans[1] = search(arr, target,false) ;
        return ans;
    }
    
}
