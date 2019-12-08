//Evan Villar array sum method prompt practice

import java.util.Scanner;

public class SumOfArray {
  
   private static void printArray(int[] arr) {  //set up method for printing the array (try to import java.util.Arrays and Arrays.priny(arr)).
      for (int i = 0; i < arr.length; i++) {    //typical for statement to run through the array.
         if (i > 0) {                           //if the index of the array is more than 0,
            System.out.print(", ");             //print a comma in between numbers.
         }          
         System.out.print(arr[i]);              //print number at index in array.
      }
   }
  
   static int findSum(int arr[], int n) {       //find sum method that takes the array and the length of the array.
   if (n <= 0)                                  //if length of array is less than or equal to 0,
   return 0;                                    //return 0.
   return (findSum(arr, n - 1) + arr[n - 1]);   //recurse, use method itself to repeat, using the same parameters, and adding the number in the array at the index of (length - 1).
   }
  
   public static void main(String[] args) {
      
       Scanner scanner = new Scanner(System.in);
       int arr[] = new int[10];                          //create array.
      
       try {                                             //begin try method.
       for(int i=0; i<arr.length; i++) {                 //typical for statement to run through the array.
          
           System.out.println("Please Enter Number: ");  //repeats until,
           arr[i]=scanner.nextInt();                     //the array is full.
       }                                                 //end for.
       }catch(Exception e) {                             //end try-catch with exception e,
           e.printStackTrace();                          //and if exception e is triggered, e.printStackTrace(); .
       }                                                 //end try catch.

       System.out.println("Contents:");                 
       printArray(arr);                                                               //call array printing method to print array.
      
       System.out.println("\n");                        
       System.out.println("The Sum of the contents : "+findSum(arr, arr.length));     //find sum of array using findSum method with the array and array length as parameters.
   }

}
