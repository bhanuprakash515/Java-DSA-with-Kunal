
import java.util.Scanner;

public class FirstJava{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
       int a = sc.nextInt();
       System.out.println("The Number is: " + a);
    }
}