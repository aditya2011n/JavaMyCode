package com.lambda.expression;

// 1. final class
// 2. 

public final class ImmutableExpl {

	private final int i ;
	
	public ImmutableExpl(int i) {
		this.i = i;
	}
	
	
	public ImmutableExpl modify(int i) {
		
		if(this.i == i) {
			return this;
		}
		else {
			return new ImmutableExpl(i);
		}
		
	}
	
	public static void main(String[] args) {

		ImmutableExpl t1 = new ImmutableExpl(10);
		ImmutableExpl t2 = t1.modify(100);
		ImmutableExpl t3 = t1.modify(10);
		
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
	}

}
