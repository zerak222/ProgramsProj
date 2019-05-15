package com.linearsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedKTimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfList = sc.nextInt();	
		
		List<Integer> integers = new ArrayList<>();
		
		for(int i=0;i<sizeOfList;i++) {
			integers.add(sc.nextInt());
		}		
		int noOfRepetitions = sc.nextInt();	
		
		 int count2= integers.stream()//
				 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))//
				 .entrySet()//
				 .stream()//
				 .sorted(Map.Entry.comparingByKey())//
				 .filter(a->a.getValue().intValue()==noOfRepetitions)//
				 .findFirst().get().getKey().intValue();
		 
		 System.out.println(count2);

	}

}
