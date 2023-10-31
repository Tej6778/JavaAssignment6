package com.javaAssignment;

import java.util.Scanner;

//Compare Two Strings
public class AssignmentModule6QXIII {
public static void main(String[] args) {
//	String brand1= "Yamaha";
//	String brand2= "Honda";
	
//	if (brand1==brand2) {
//	System.out.println("String are same");	
//	}else {
//	System.out.println("String are different");
//	}

/*----------------------With input by user------------*/	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a name");
	String name= sc.next();
	System.out.println("Enter a name1");
	String name1= sc.next();
	
	if (name.equals(name1)) {
	System.out.println("Name are equal");	
	}else {
	System.out.println("Name are different");	
	}
	
	
}
}
