import java.util.Scanner;
class first{
    public static void main(String[] args) {
        System.out.println("enter the length of rectangle");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("enter the breadth of rectangle");
        int breadth = sc.nextInt();
        int parameter = 2*(length + breadth);
        System.out.println("the parameter of rectangle is"+" "+parameter);
        sc.close();
    }
}