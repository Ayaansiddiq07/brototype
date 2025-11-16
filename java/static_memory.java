//understanding the static memory cleary

public class static_memory {
    int a=10;
    static int b=20;
    public static void main(String args[]) {
        static_memory h1=new static_memory();
        static_memory h2=new static_memory();
        System.out.println("Before changing values:"+h1.a+" "+h1.b);
        h1.b=20;
        h2.b=140;
        System.out.println("The value inside b="+h1.b);

    }
}
//here we can see that when we change the value of b using h1 and h2 it print the last updated value of b since static variables are stored in static memory and there is only one copy of static variables shared among all objects of the class.