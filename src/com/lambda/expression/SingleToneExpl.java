package com.lambda.expression;

public class SingleToneExpl {
	
	private static SingleToneExpl s = null;
	
	private SingleToneExpl() throws Exception {
		
		if(s != null) {
			throw new Exception("not allowed"); 
		}
		
	}
	
	public static SingleToneExpl getInstance() throws Exception {
		
		if(s == null) {
			synchronized(SingleToneExpl.class){
				if(s == null) {
					s =  new SingleToneExpl();
				}
			}
		}
		
		return s;
	}
	
}

