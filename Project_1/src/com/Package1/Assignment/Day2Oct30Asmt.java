package com.Package1.Assignment;

public class Day2Oct30Asmt {
	
		float a;
		float b;
		
		public float sum (float a , float b) {
			System.out.println("Sum of numbers is " + (a+b));
			return a+b;
		 	
		}
		public float sub (float a , float b){
			System.out.println("Diff of numbers is " + (a-b));
			return a-b;
		 	
		}
		public float mul (float a , float b){
			System.out.println("Multiplication of numbers is " + (a*b));
			return (a*b);
		 	
		}
		public float div (float a , float b){
			System.out.println("division of numbers is " + (a/b));
			return (a/b);
		 	
		}
		
		public static void main(String[] args)
		{
			Day2Oct30Asmt arth_op = new Day2Oct30Asmt();
			
			float result1 = arth_op.div(arth_op.mul(arth_op.sub(arth_op.sum(arth_op.sum(10, 2), 2), 2), 2), 2);
			System.out.println("ASSIGNMENT1 ----> Arthmetic operation result : " + result1 + "\n");
			
			float result2 = arth_op.div(arth_op.sub(arth_op.sub(arth_op.sum(arth_op.mul(10, 2),2),2),2),2);
			System.out.println("ASSIGNMENT2 ----> Arthmetic operation result : " + result2);
			
			
		}
	

}
