package com.practies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class LembdaExpression {

	public static void main(String[] args) {
		
	Predicate<Collection<Integer>> p = (val) -> val.isEmpty();

	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(5);
	al.add(1);
	System.out.println(p.test(al));
	}

	

}
