package com.Package1.Assignment;

public class Day4Nov6Asmt {
	
	Day4Nov6Asmt()								{ this(1,2,3,4); System.out.println("Default Constructor");}
	Day4Nov6Asmt(int a)							{ this ();       System.out.println("Single Parameterised Constructor");}
	Day4Nov6Asmt(int a , int b)					{ this(1,2,3);   System.out.println("Two Parameterised Constructor");}
	Day4Nov6Asmt(int a , int b, int c) 			{ this (1);      System.out.println("Three Parameterised Constructor");}
	Day4Nov6Asmt(int a , int b, int c, int d)	{                System.out.println("Four Parameterised Constructor");}
	
	void method() 								
	{   this.method3(1,2,3);
		System.out.println("default method");
		this.method4(1,2,3,4);
		this.method1(1);
		this.method2(1,2);
	}
	
	
	void method1(int a) 						{ System.out.println("Single Parameterised method");}
	void method2(int a , int b)  				{ System.out.println("Two Parameterised method");}
	void method3(int a , int b, int c) 			{ System.out.println("Three Parameterised method");}
	void method4(int a , int b, int c, int d)   { System.out.println("Four Parameterised method");}
	
	public static void main (String args[])
	{	System.out.println("Assignment 1---------- \n");
		Day4Nov6Asmt a1 = new Day4Nov6Asmt(1,2);
		System.out.println("\nAssignment 2---------- \n");
		a1.method();
	}

}
