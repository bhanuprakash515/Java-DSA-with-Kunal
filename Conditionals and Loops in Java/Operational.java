
import java.util.Scanner;

public class Operational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while(true){ 
            System.out.print("Enter a Operator: ");
            char character = sc.next().trim().charAt(0);
            if((character == '+') || (character == '-') || (character == '*') || (character == '/') || (character == '%')){
                System.out.print("Enter Two Numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(character == '+'){
                    result = a + b;
                }
                else if (character == '-'){
                    result = a - b;
                }
                else if(character == '*'){
                    result = a * b;
                }
                else if ( character == '/'){
                    if(b != 0){
                        result = a / b;
                    }
                }
                else if (character == '%'){
                    result =  a % b;
                }
                System.out.println(result);

            }
            else{
                System.out.println("Entered a Wrong Operator><><>< Type Correct Operator");
            }
            
        }
    }
}
