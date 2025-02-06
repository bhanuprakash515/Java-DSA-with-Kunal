
import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        while(a > 0){
            int rem = a % 10;
            System.out.print(rem);
            a = a / 10;
        }
        sc.close();
    }
}
