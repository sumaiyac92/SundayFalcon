package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Polymorphism is the ability of an object to take on many forms.
		- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
		- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	*/
		car(4,4);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}	
	
	// Method Overriding - Runtime Poly,orphism - dynamic binding
	// Same method name from parent class to overrides
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rentalIncome = 15000;
		int sideHussel = 25000;
		int newCalculateAnnualIncome = calculateAnnualIncome + rentalIncome +sideHussel;
		System.out.println("My Annual Income = " + newCalculateAnnualIncome);
	}

		
	public static void car(){
	
	System.out.println("My car is tesla !");
	}
	
	public static void car(int door){
	System.out.println("My car is Tesla !, it has door : " + door);
	}
	
	public static void car(String color){
	System.out.println("My car is Tesla !, it has color : " + color);
	}
		
	public static void car(Boolean dualMotor){
	System.out.println("My car is Tesla !, it has dualMotor : " + dualMotor);
	}
	
	public static void car(int seat, String bodyType){
	System.out.println("My car is Tesla !, it has seat :" + seat + "it has bodyType :" + bodyType);
	}
	
	public static void car(int wheel, int door){
	System.out.println("Mycar is Tesla ! it has wheel : " + "it has door : " + door);
	
		
		

	}

}
