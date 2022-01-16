/*import java.util.Scanner;
class PrimeNumber7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =  in.nextInt();
        boolean flag = false;
        for (int i = 2 ; i<= num / 2 ;i ++){
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println(num + " is  prime");
        }
        else {
            System.out.println(num + " is not prime");
        }
    }
} */




import java.util.Scanner;
class PrimeNumber7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int num = in.nextInt();
        int count = 0;
        for (int i = 2 ;i <=100 ;i++) {
            if(search(i)==false) {
                count++;
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        System.out.println(count+ " prime numbers are there in the specified range");
    }

    static boolean search(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}




















