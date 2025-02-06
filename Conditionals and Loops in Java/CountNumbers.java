
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Numner: ");
        int a = sc.nextInt();
        
        int count = 0;
        while(a > 0){
            int rem = a % 10;
            if (rem == 5){
                count ++;
            }
            a = a / 10;
        }
        System.out.println("Count Value is: " + count);
    }
}
