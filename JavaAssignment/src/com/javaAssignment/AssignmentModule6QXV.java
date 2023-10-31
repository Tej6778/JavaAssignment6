package com.javaAssignment;

import java.util.Scanner;

//Demonstrate try catch block
public class AssignmentModule6QXV {
public static void main(String[] args) {
	int a,b;
Scanner sc= new Scanner(System.in);
try 
{
	System.out.println("Enter a : ");
	a = sc.nextInt();
	
	System.out.println("Enter B : ");
	b = sc.nextInt();
	
	System.out.println("Division"+ (a/b));
}

catch (Exception e) 
{
	// TODO: handle exception
	e.printStackTrace();
}


	
		
}
}
