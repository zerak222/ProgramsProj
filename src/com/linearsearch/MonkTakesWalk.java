package com.linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MonkTakesWalk {
	
	private static final List<String> VOWELS= Arrays.asList("a","e","i","o","u");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int noOfTestCases = sc.nextInt();
		String testCases[] = new String[noOfTestCases];
		for(int i=0;i<noOfTestCases;i++) {
			
			testCases[i]=sc.next();
		}
		for(String str: testCases) {
			int count =0;
			String[] splitString = str.split("");
			for(String split :splitString) {
				if(VOWELS.contains(split)) {
					count++;
				}				
			}
			System.out.println(count);
			
		}
		

	}

}
