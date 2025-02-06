
import java.util.Scanner;

public class SwutchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Fruit: ");
        String fruit = sc.next();
        switch(fruit){
            case "Apple":
                System.out.println("Color is Red");
                break;
            case "Bananna":
                System.out.println("color is Yellow");
                break;
            case "Dragon Fruit":
                System.out.println("Color is Pink");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
    }
}
