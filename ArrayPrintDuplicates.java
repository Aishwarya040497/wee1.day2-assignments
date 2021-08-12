package week1.day2.assignments;

import java.util.Arrays;

public class ArrayPrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrNum= {1, 2, 3, 3, 4};
		
		System.out.println("Duplicate elements are : ");
		
	//To print duplicates in Array
		
	for (int i = 0; i <= arrNum.length-1; i++) {
		
		for (int j = i+1; j <=arrNum.length-1; j++) {
			
			if (arrNum[i]==arrNum[j])
				
				System.out.println(arrNum[j]);
			}
		}
		
	}
	

	}

