//understanding constructor in java
import java.util.Scanner;
public class understanding_constructor {
    int num=0;
    String name;
    //inner class
    class Inner {
        void display() {
            System.out.println("Welcome to Constructor Understanding!");
        }
    }

    //constructor
    understanding_constructor(int num,String name){
        Inner Obj1= new Inner();
        Obj1.display();
        this.num=num;
        this.name=name;
    }
    public static void main(String args[]) {

    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        System.out.println("Enter name:");
        String name=sc.next();    
        understanding_constructor obj=new understanding_constructor(num,name);
        System.out.println("Enter number:");
        num=sc.nextInt();
        System.out.println("Enter name:");
        name=sc.next();
        understanding_constructor obj2=new understanding_constructor(num,name);

        System.out.println("Number: "+obj.num);
        System.out.println("Name: "+obj.name);
        System.out.println("Number: "+obj2.num);
        System.out.println("Name: "+obj2.name);
    }
}

//when we create an object of the  class using the new keyword the constructor is called automatically and the values passed as arguments are assigned to the instance variables num and name using the this keyword.

//also we have created an inner class named Inner inside the understanding_constructor class and called its method display() inside the constructor to demonstrate that inner class can be accessed within the outer class.

