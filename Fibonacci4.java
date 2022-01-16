import java.util.Scanner;

class Fibonacci4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =0;
        int b = 1;
        int count = 2;
        int num = in.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        while (count<=num){
            int temp = b;
            b =  b+a;
            a = temp;
            count++;
            System.out.print(b+" ");
        }
        //System.out.println(b);

    }
}