import java.util.Scanner;

public class program_to_learn_if_and_else_in_java {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String[] item = new String[10];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add items");
            System.out.println("2. Display items");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear newline
            switch (choice) {
                case 1:
                    System.out.println("Add item to your cart");
                    System.out.print("How many items do you want to add (max 10)? ");
                    int n = sc.nextInt();
                    sc.nextLine(); // clear newline
                    if (n > 10) {
                        System.out.println("You can add up to 10 items only.");
                        n = 10;
                    }   for (int i = 0; i < n; i++) {
                        System.out.print("Enter item " + (i + 1) + ": ");
                        item[i] = sc.nextLine();
                    }   count = n;
                    break;
                case 2:
                    System.out.println("You choose to display items in your cart:");
                    for (int i = 0; i < count; i++) {
                        System.out.print(i+1+"."+item[i]
                                +"\n");
                    }   System.out.println();
                    Thread.sleep(500); // 500 milliseconds delay
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
