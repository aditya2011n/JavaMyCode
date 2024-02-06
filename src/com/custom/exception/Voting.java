package com.custom.exception;

import java.util.Scanner;

public class Voting {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the age");
		Scanner src = new Scanner(System.in);
		
		int age = src.nextInt();
		
		try {
			if(age<18) {
				throw new UnderAgeException("you can not give the vote");
			}
			else {
				System.out.println("you can give the vote");
			}
		}
		catch(UnderAgeException ex) {
			ex.printStackTrace();
		}
	}

}
