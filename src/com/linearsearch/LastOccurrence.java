package com.linearsearch;

import java.util.Scanner;

public class LastOccurrence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt(); 
		int numberToFind = sc.nextInt();
		int indexOfNumber=-1;
		
		Integer[] arrayOfNumbers = new Integer[size];
		for(int i=0;i<size; i++) {
			arrayOfNumbers[i]=sc.nextInt();
		}
		
		
		
		
		for(int i=0;i<size; i++) {
			if(arrayOfNumbers[i].equals(numberToFind)) {
				indexOfNumber=i+1;
			}			
		}
		
		System.out.println(indexOfNumber);
		
	}

}
