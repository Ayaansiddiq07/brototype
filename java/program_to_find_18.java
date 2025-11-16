
import java.util.Scanner;

//program to find if valid to vote or not

public class program_to_find_18{
    public static void main(String[] args){
        System.out.println("Welome to voting portal");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=s.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else if(age<18){
            System.out.println("You are not eligible to vote");
        }
        else{
            System.out.println("Invalid input, please enter the correct age");
        }
    }


}