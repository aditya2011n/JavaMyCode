package com.practies;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i.like.this.program.very.much"; 
		// much.very.program.this.like.i

		String reverseTheString = reverseTheString(str);
		System.out.println(reverseTheString);

	}

	private static String reverseTheString(String str) {
		// TODO Auto-generated method stub

		String[] data = str.split("\\.");

		String res = "";

		for (int i = data.length - 1; i >= 0; i--) {
			res = res + data[i] + ".";
		}
		
		

		System.out.println(Arrays.toString(data));
		System.out.println("=========================");

		System.out.println(res);
		return res;

	}
}
