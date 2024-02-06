package com.practies;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Program1{

	public static void main(String[] args) {
		
		Function<Integer, Integer> fun = data -> data * data;
		
		System.out.println(fun.apply(4));
	
	}
}
