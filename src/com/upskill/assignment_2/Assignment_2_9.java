package com.upskill.assignment_2;

public class Assignment_2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program to swap two string variables (Talen, Tech) and display result on the screen.
		
		
		myMethod();

	}

	private static void myMethod() {
		// TODO Auto-generated method stub
		
		String a = "Talen";
		String b = "Tech";
		
		String swap = a;
		a = b;
		b = swap;
		
		System.out.println("swap valu a: " +a);
		System.out.println("sap valu b:" +b);
		
		
		
	}

}
