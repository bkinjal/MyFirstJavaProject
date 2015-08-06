package com.digitek.polymorphism;

public class OverloadingExample {
	
	
	public static void main(String  args[]) {
		System.out.println("Main method");
	}
	
	
	public void add() {
		System.out.println("add()");
	}
	
	
	public void add(int no1, int no2) {
		System.out.println("add(int no1, int no2)");
	}

	public void add(int no1) {
		int sum = no1+ 10;
		System.out.println("add(int no1)");
	}

	public void add(double no1, double no2) {
		System.out.println("add()");
	}

	public void add(int no1, double no2) {
		System.out.println("add()");
	}
	
	public void add(double no1, int no2) {
		System.out.println("add()");
	}
	
}


