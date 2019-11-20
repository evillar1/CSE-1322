//evan villar testing practice

import java.util.*;

public class linkedList
{
	public static int sum(List<Integer> myList)
	{
		int sums = 0;
		for(int i = 0; i < myList.size(); i++) {
			sums = myList.get(i) + sums;
		}
		return sums;
	}
	
	public static void main(String args[])
	{
		List<Integer> myList = new LinkedList<Integer>();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("input 10 ints: ");
		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			myList.add(num);
		}
		System.out.println("Linked list: " + myList);
		System.out.println("Linked list sum: " + sum(myList));
	
	}
}