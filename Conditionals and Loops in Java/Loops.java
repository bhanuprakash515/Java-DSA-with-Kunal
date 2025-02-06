
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        // For Loop 
        // for(int i = 0; i <= a; i +=2){
        //     System.out.print(i + " ");
        // }

        // While Loop
        int i = 1;
        while(i <= a){
            System.out.print(i + " ");
            i += 1;

        }
    }
}
