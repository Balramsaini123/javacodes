import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        int a= 0;
        for(int i=1;i<=n;i++){
             a += i;
            
        }
         System.out.println("sum of n no. is"+a);
        sc.close();
    }
    
}
