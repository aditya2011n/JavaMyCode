package com.lambda.expression;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleToneTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SingleToneExpl s1 = SingleToneExpl.getInstance();
		SingleToneExpl s2 = SingleToneExpl.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Constructor<SingleToneExpl>[] construct = (Constructor<SingleToneExpl>[]) SingleToneExpl.class.getDeclaredConstructors();
	
		for (Constructor<SingleToneExpl> cons : construct) {
			cons.setAccessible(true);
			
			 s2 = cons.newInstance();
		}
		System.out.println(s2.hashCode());
	}

}
