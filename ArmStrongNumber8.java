import java.util.Scanner;
class ArmStrongNumber8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = strong(num);
        System.out.println(ans);
    }
    static boolean strong(int num ) {
        int original = num ;
        int sum  = 0;
        while (num>0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }
        return sum==original ;
    }
}