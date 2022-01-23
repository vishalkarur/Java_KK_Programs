public class BinarySearch16 {
    public static void main(String [] args) {
        int [] arr = {1 , 4 , 6 , 9 , 18 , 29 , 89 , 97 , 189 , 1200};
        int target = 189;
        System.out.println(search(arr,target));
    }
    public  static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
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
