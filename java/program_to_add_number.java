
import java.util.Scanner;

//program to add two numbers

public class program_to_add_number{
    public static void main(String[] args) {
        calculator calc=new calculator();
        
       int[] values= calc.input();
       int result = calc.add(values[0], values[1]);

       calc.display(result);
       calc.printAuthor();
        
    }
}
class calculator{
    int[] input(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        return new int[] {num1, num2};
    }
    int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    int display(int sum){
        System.err.println("The sum is: " + sum);
        return 0;
    }
    int printAuthor(){
        System.out.println("Program developed by Ayaan");
        return 0;
    }
}