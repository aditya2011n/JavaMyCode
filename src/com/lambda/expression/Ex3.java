package com.lambda.expression;

interface inEx3{
	public int getLenght(String s);
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inEx3 ex3 = s -> s.length() ;
		
	System.out.println(ex3.getLenght("Aditya"));
	System.out.println(ex3.getLenght("Rabi"));			

	}

}
