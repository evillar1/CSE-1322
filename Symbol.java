//CSE 1321L
//Java
//spring 2019
//Prof. Malcom
//Evan Villar
//Lab #13633

import java.util.Scanner;

public class Symbol
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      int rows;
      char symbol;
     
      System.out.println("Please input a symbol: ");
      symbol = scan.next().charAt(0);
      System.out.println("Please input a number: ");
      rows = scan.nextInt();
      for (int r = 0; r < rows; r++) {
         System.out.println("");
         for (int x = 0; x < rows; x++) {
            System.out.print(symbol);

         }
      }
      
   }
}
  