
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // type casting
        // int a =  (int)56.75f;
        // System.out.println(a);

        // int a = 259;
        // byte b = (byte) a;
        // System.out.println(b); // a % 256


        // char number = 'a';
        // System.out.print(number);

        Scanner sc = new Scanner(System.in);
        float tempC = sc.nextFloat();
        float tempF = (int) (tempC * 9 / 5) + 32;
        System.out.print(tempF);
    }
}
