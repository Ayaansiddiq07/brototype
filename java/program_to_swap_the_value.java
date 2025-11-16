//program to swap the value of two variables using third variable
import java.util.Scanner;

public class program_to_swap_the_value{
    public static void main(String args[]){
        Swapvalue obj1=new Swapvalue();
        int[] values=obj1.input();
        int a=values[0];
        int b =values[1];
        obj1.swap(a,b);
        obj1.display(a, b);
    }
}
class Swapvalue{
    int[] input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 value:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping the value of a:"+a);
        System.out.println("Before swapping the value of b:"+b);
        return new int[]{a,b};
    }
    int[] swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }
    void display(int a,int b){
        System.out.println("After swapping the value of a:"+a);
        System.out.println("After swapping the value of b:"+b);
    }
}