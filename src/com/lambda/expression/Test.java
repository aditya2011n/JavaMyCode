package com.lambda.expression;

interface interf{
	public void m1();
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// TODO Auto-generated method stub
			interf i1 = () -> System.out.println("Hello Aditya");
			i1.m1();
		}

}
