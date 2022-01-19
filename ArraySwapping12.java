import java.util.Arrays;

public class ArraySwapping12 {
    public static void main(String [] args) {
        int [] arr = {1 , 4 , 6, 9 , 10 , 11}; 
        swap(arr, 1 , 2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int [] arr , int a , int b ) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
