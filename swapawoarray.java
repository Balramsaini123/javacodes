import java.io.*;
import java.util.Arrays;
public swapawoarray Main {
   public static void main(String[] args) {
      
      // The array elements
      int arr[] = { 10, 2, 3, -5, 99, 12, 0, -1 };
      
      // Print all array elements
      System.out.println("The array elements before swapping are-");
      for (int i : arr) {
         System.out.print(i + " ");
      }
      
      // We will be swapping 2nd index element with 4th index element
      int firstIndex = 2, secondIndex = 4;
      
      // Temp variable
      int temp = arr[firstIndex];
      
      // Swapping
      arr[firstIndex] = arr[secondIndex];
      arr[secondIndex] = temp;
      
      // Print all array elements
      System.out.println("\nThe array elements after swapping are-");
      for (int i : arr) {
         System.out.print(i + " ");
      }
   }
}
