
import java.util.Scanner;



public class FaboncciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(b + " ");
            count++;
    }
        System.out.println(b);
        sc.close();
        

    }
}
