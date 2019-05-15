package com.linearsearch;

import java.util.Scanner;

public class SumSetProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sizeOfA = sc.nextInt();
		
		String[] elementsOfA = sc.nextLine().split("");
		Integer A[] = new Integer[sizeOfA];
		for(int i =0;i<sizeOfA;i++) {
			
			A[i]=Integer.valueOf(elementsOfA[i]);
		}
		
		
	}

}
