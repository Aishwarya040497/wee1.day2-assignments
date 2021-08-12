package week1.day2.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArraySecondLargestElement {

	public static void main(String[] args) {

		int[] arrNum = { 1, 5, 8, 2, 6 };
		
		// To find second largest element
		
	Arrays.sort(arrNum);
	System.out.println("Sorted array is: ");
		for (int i = 0; i <= arrNum.length-1; i++) {
			System.out.println("arrNum is [" +i+ "]= " +arrNum[i]);
			
		}
		System.out.println("Second largest element is: " +arrNum[arrNum.length-2]);
		
	}
}