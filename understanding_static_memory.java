//static memory allocation in java

public class understanding_static_memory {
    int a=10;
    static int b=20;
    public static void main(String args[]) {
        understanding_static_memory h1=new understanding_static_memory();
        understanding_static_memory h2=new understanding_static_memory();
        System.err.println("Before changing values:"+h1.a+" "+h1.b);
        h1.a = 120;
        h1.b = 10;
        System.err.println("After changing values:"+h1.a+" "+h1.b);
        System.err.println("Acessing through object h2:"+h2.a+" "+h2.b);
    }
}
//here we can see that when we change the value of instance variable 'a' using object h1 it does not affect the value of instance variable 'a' when accessed using object h2 because instance variables are stored in heap memory and each object has its own copy of instance variables.
//but when we change the value of static variable 'b' using object h1 it affects the value of static variable 'b' when accessed using object h2 because static variables are stored in static memory and there is only one copy of static variables shared amaong all objects of the class.