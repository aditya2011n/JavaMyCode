package com.practies;

class Engine{
	int speed;
	public Engine(int speed) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}
}

public class Immutable {

	private final int id;
	private final String name;
	private final Engine engine;

	public Immutable(int id, String name, Engine e) {
		super();
		this.id = id;
		this.name = name;
		Engine newEngine = new Engine(e.speed);
		this.engine = newEngine;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Engine e = new Engine(50);
		Immutable immutable = new Immutable(1, "java",e);
		System.out.println(immutable.name == "java");
		System.out.println(immutable.engine.speed);
		e.speed = 70;
		System.out.println(immutable.engine.speed);
		System.out.println(immutable.id);
		
	}
}
