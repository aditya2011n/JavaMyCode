package com.immutable;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address homeAddress = new Address("jabalpur", "M.P.");
		
		Student student = new Student(1, "Aditya", homeAddress);
		System.out.println(student);
		
		Address address = student.getAddress();
		address.setCity("BLR");
		address.setState("Kernataka");
		System.out.println(student);
	}

}
