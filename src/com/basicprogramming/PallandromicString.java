package com.basicprogramming;

import java.util.Scanner;

public class PallandromicString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(isPallandrom(str)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

	private static boolean isPallandrom(String str) {
		String[] letters = str.split("");
		boolean isPallandrom=false;
		int lengthOfString = letters.length;
		for(int i=0;i<lengthOfString/2;i++) {
			isPallandrom = letters[i].equals(letters[lengthOfString-1-i]);
		}
		return isPallandrom;
	}

}
