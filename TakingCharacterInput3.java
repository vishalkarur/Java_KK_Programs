import java.util.Scanner;

class TakingCharacterInput3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

    }
}