package com.javaAssignment;

import java.util.Scanner;

//WAP to demonstrate multiple catch blocks
public class AssignmentModule6QXVI {
public static void main(String[] args) {
	int a,b,c;
	Scanner scanner = new Scanner(System.in);
	
	try 
	{
		System.out.println("Enter the value of a : ");
		a = scanner.nextInt();
		
		System.out.println("Enter the value of B : ");
		b = scanner.nextInt();
		
		c = Integer.parseInt(scanner.nextLine());
		System.out.println("Division"+ (a/b));
	}
	
	catch (ArithmeticException e) 
	{
		// TODO: handle exception
		System.out.println("Arithmetic "+e);
	}
	catch (NumberFormatException e)
	{
		// TODO: handle exception
		System.out.println("Number Format "+e);
	}


}
}
