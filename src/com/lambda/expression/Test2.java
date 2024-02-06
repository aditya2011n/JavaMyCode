package com.lambda.expression;

interface interf2 {
	public void m2(int a, int b);
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interf2 i1 = (a,b) -> System.out.println("sum of the number is ="+(a+b));
		
		i1.m2(10, 20);
		i1.m2(200, 145);
		
	}

}
