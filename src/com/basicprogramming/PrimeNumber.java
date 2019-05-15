package com.basicprogramming;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	private static boolean isPrime(int i) {
		int limit = i/2;
		for(int j=2;j<=limit;j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}

}
