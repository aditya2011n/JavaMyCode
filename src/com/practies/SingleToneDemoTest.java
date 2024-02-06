package com.practies;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleToneDemoTest {

	public static void main(String[] args) throws Exception  {
		
		SingleToneDemo s1 = SingleToneDemo.getInstance();
		SingleToneDemo s2 = SingleToneDemo.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Constructor<SingleToneDemo>[] constructors = (Constructor<SingleToneDemo>[]) SingleToneDemo.class.getDeclaredConstructors();

		for( Constructor<SingleToneDemo> cons: constructors) {
			cons.setAccessible(true);
			
			s2 = cons.newInstance();
		}
		System.out.println(s2.hashCode());
	}

}
