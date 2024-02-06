package com.practies;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleToneDemo {

	private static SingleToneDemo s;

	private SingleToneDemo() throws Exception {
		if(s!=null) {
			throw new Exception("not allow to create");
		}

	}

	public static SingleToneDemo getInstance() throws Exception {
				if (s == null) {
					
					synchronized (SingleToneDemo.class) {
						if (s == null) {
							s = new SingleToneDemo();
						}
					}
					
					 
				}
			

		return s;
	}

}
