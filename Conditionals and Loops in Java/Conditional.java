
import java.util.Scanner;

public class Conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value a:");
        int a = sc.nextInt();
        System.out.print("Enter Value b:");
        int b = sc.nextInt();
        if (a > b){
            System.out.println("A is Largest");

        }else{
            System.out.println("b is Largest");
        }

        sc.close();
    }
}