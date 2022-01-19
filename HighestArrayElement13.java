import java.util.*;
public class HighestArrayElement13 {
    public static void main(String [] args) {
        int [] arr = {1 , 2 , 4 , 5, 6, 7 ,8 ,9 ,10};
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(search(arr,start,end));
        in.close();
        
    }
    public static int search(int[] arr , int start , int end) {
        int max = arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max ;
        
    }
    
}
