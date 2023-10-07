import java.util.Scanner;
public class Swapvalue {
    //Swap the no. without using third variable
    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter your first no. a:");
    //     int a = sc.nextInt();
    //     System.out.println("Enter your second no. b:");
    //     int b = sc.nextInt();
        
    //     a = a+b;
    //     b = a-b;
    //     a = a-b;
    //     System.out.println("After swap\n " + "a is:" + a + "\n" + "b is:" +b);
    //     sc.close();
    // }

    //swap using third variable
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no. a:");
        int a = sc.nextInt();
        System.out.println("Enter your second no. b:");
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        // c = a;
        System.out.println("After swap\n " + "a is:" + a + "\n" + "b is:" +b);
        sc.close();
    }
}
