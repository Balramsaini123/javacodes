import java.util.Scanner;
public class oddeven {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Enter your name");
          String name = sc.nextLine();
        
         System.out.println("Enter your number to check wheather it is odd or even");
          int Number = sc.nextInt();
         if(Number%2==0){
            System.out.println("Mr/Ms "+ name +" The given no. is even");
         }
         else{
            System.out.println("Mr/Ms"+name+"the given no. is odd");
         }
         sc.close();
    }
}
