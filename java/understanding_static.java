// //understanding how the static will work in java

// public class understanding_static {
//     int a = 10;

//     public static void main(String args[]) {
//         System.out.println(a);
//         //this line will give error because static method can not access non static variable directly
//     }
// }

// //to fix the error we can make variable a as static
// public class understanding_static {
//     static int a = 10;

//     public static void main(String args[]) {
//         System.out.println(a);
//         //now this will work fine because both main method and variable a are static
//     }
// }
// //or we can create object of the class to access non static variable
// public class understanding_static {
//     int a = 10;

//     public static void main(String args[]) {
//         understanding_static obj = new understanding_static();
//         System.out.println(obj.a);
//         //now this will work fine because we are accessing non static variable through object
//     }
// }