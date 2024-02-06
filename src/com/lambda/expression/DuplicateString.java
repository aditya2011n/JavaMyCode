package com.lambda.expression;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateString {

	public static void main(String[] args) {
		String duplicate = "I love love java java very much";

		String[] data = duplicate.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String str : data) {

			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			} else {
				hm.put(str, 1);
			}
		}

		for (Entry<String, Integer> finalData : hm.entrySet()) {
			if(finalData.getValue()>1)
			System.out.println(finalData.getKey() + "::" + finalData.getValue());
		}

	}

}
