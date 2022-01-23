public class EvenDigitsArray14 {
    public static void main(String [] args) {
        int [] nums  = {1 , 12 , 1 , 3 , 18 , 19 , 9};
           System.out.println(findnumber(nums));             
    }
    public static boolean even_no_of_digits(int a) {
        int count = 0;
        while(a>0) {
            count++;
            a = a / 10;
        }
        if (count%2==0) {
            return true;
        }
        else {
           return  false;
        }
    } 
public static int findnumber(int [] nums ) {
    int count = 0;
    for(int num :nums) {
        if(even_no_of_digits(num)) {
            count++;
        }
    }
    return count;

}
}
