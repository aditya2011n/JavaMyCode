package com.immutable;

final public class Student {

	private final int id;
	private final String studentName;
	private final Address address;

	public Student(int id, String studentName, Address address) {
		this.id = id;
		this.studentName = studentName;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public Address getAddress() {
	//	return address;
		return Address.getInstance(address);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", address=" + address + "]";
	}

}
