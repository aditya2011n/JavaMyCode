package com.practies;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		String str = "geeksforgeeks";			// geksfor
		System.out.println(str.charAt(1)); 
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		for(int i = 0; i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		System.out.println(hs);
		
		StringBuilder sb = new StringBuilder();
		
		
		Iterator<Character> iterator = hs.iterator();
		while(iterator.hasNext()) {
			Character ch = iterator.next();
			sb = sb.append(ch);
		}
		System.out.println(sb.toString());
	}

}
