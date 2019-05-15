package com.basicprogramming;

import java.util.Scanner;

public class SeatingArrangement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		Integer[] seatNos = new Integer[noOfTestCases];
		for(int i=0;i<noOfTestCases;i++) {
			seatNos[i]=sc.nextInt();
		}
	}

}
