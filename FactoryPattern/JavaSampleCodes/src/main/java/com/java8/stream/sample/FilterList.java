package com.java8.stream.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  originalList =  new ArrayList<Integer>();
		originalList.add(10) ;
		originalList.add(2) ;
		originalList.add(1) ;
		originalList.add(3) ;
		originalList.add(4) ;
		originalList.add(20) ;
		
		
	}
	public static Stream<Integer> filterList (List <Integer> originalList){	
		return  originalList.stream() ;
		//return originalList.stream().filter(value -> value > 10).collect(Collectors.toList());
	}
}
