package com.linearsearch;

import java.util.Scanner;

public class HolidaySeason {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int length= sc.nextInt();
		int count =0;
		
		String[] str = sc.next().split("");	
		
		
		for(int i=0;i<length;i++) {
			if(i<length-3&& str[i].equals(str[i+2])&& str[i+1].equals(str[i+3])) {
				count++;
			}			
		}
		
		System.out.println(count);
		
		
	}

}
