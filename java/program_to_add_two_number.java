
import java.util.Scanner;

public class program_to_add_two_number{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers to add: " );
        int num1=s.nextInt();
        int num2=s.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}