package com.practies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.sound.midi.Instrument;

public class SecMin {

	public static void main(String[] args) {
	
		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
		Integer sumOfEven = asList.stream().filter(n -> n%2 == 0).reduce((a,b)-> a+b).get();
		System.out.println(sumOfEven);
	}

}
