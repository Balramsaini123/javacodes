import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        System.out.println("enter the no. of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j= 1; j<=n-i; j++){
                System.out.print(" ");}
                for(int k=1; k<=i; k++){
                    System.out.print("*"+"\t");
                }
                System.out.println();
            }
            sc.close();
        }
    }

