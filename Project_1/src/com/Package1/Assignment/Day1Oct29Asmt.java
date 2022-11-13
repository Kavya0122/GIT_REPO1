package com.Package1.Assignment;

public class Day1Oct29Asmt {
	int rollNo;
	int age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you"); 
		
	}
	public void display2()
	{
		System.out.println("Automation is very easy..");
		
	}

	public static void main(String[] args) {
		Day1Oct29Asmt s1 = new Day1Oct29Asmt();
		s1.age= 17;
		s1.rollNo = 12345;
		s1.display1();
		s1.display2();
		
		System.out.println("Age is : " + s1.age + "\nrollnumber is  : " + s1.rollNo);
	}
}
