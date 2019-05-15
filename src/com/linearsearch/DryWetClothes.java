package com.linearsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DryWetClothes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =3; //sc.nextInt();
		int m =3; //sc.nextInt();
		int g =2; //sc.nextInt();
		int iter=0,count=0;
		//sc.nextLine();
		
		Integer[] rainTimes= {3,3,2};//new Integer[n];
		List<Integer> dryTimes=new ArrayList<>(); 
		dryTimes.add(4);
		dryTimes.add(1);
		dryTimes.add(3);
		
		
	/*	for(int i =0;i<n;i++) {
			rainTimes[i]=sc.nextInt();
		}
		sc.nextLine();
		for(int i =0;i<m;i++) {
			dryTimes.add(sc.nextInt());
		}*/
		Collections.sort(dryTimes);
		
		
		
		int t = rainTimes[0];
		while(iter<=g && iter<n-1 && iter<m-1) {			
			t=(dryTimes.get(iter) -rainTimes[iter+1])+t;
			if(t>=0) {
				count++;
			}
			iter++;
		}
		System.out.println(count);
		
				

	}

}
