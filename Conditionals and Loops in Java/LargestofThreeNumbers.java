
import java.util.*;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a > b) && ( a > c)){
            System.out.println("A is Greater");
        }else if (b > c){
            System.out.println("B is Greater");
        }else{
            System.out.println("C is Greater");
        }
        sc.close();


        /// Finding the Maximum value using Math function.
        int max = Math.max(c,Math.max(a , b));
        System.out.println(max + " is Greater");
    }
}
