import java.util.*;
public class LargestOf3Numbers2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c ;
        System.out.println(max);
    }
}
