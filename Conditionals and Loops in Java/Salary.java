
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value a:");
        int a = sc.nextInt();
        if(a >= 10000){
            a += 2000;
        }else if (a >= 20000){
            a += 3000;
        }else{
            a += 1000;
        }

        System.out.println(a);
        sc.close();
    }
}
