package com.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(101, "john");
		m.put(110, "David");
		m.put(108, "Scott");
		m.put(104, "mary");
		m.put(102, "Tye");
		m.put(103, "David");

		Map<Integer, String> collect = m.entrySet().stream().sorted(Map.Entry.comparingByValue()).
			collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(collect);
	}
}
