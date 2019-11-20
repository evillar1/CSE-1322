// evan villar practice

import java.util.*;

public class OrderMatters
{
	
	static String reverseString(String word) {
		if (word.isEmpty())
            return word;       
        return reverseString(word.substring(1)) + word.charAt(0);
	}
	
	static String recursiveString(String word) {
		if (word.length() == 1)
            return word;      
        return word.charAt(0) + recursiveString(word.substring(1));
	}
	
	public static int summingSums(int[] arr, int x) {
		if (x == 0) {
			return arr[0];
		}
		return arr[x] * (x + 1) + summingSums(arr, x-1);		
	}
	
	public static void main (String args[])
	{
		Random rand = new Random();
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt((100-0) +1) + 1;	
		}
		int arr1[] = {1,4,5,7,3};
		Scanner scan = new Scanner (System.in);
		System.out.println("Input: ");
		String x = scan.nextLine();
		System.out.println(recursiveString(x));
		System.out.println(reverseString(x));
		System.out.println(summingSums(arr, arr.length  - 1));
	}
}
