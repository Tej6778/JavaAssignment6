package com.javaAssignment;

import java.util.Scanner;

//7th question create fibonacci Series
public class AssignmentModule6QVI {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number");
	int t=sc.nextInt();
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	for (int i = 0; i<=t; i++) {
		int c=(a+b);
		a=b;
		b=c;
	System.out.println(c);	
	}	
}
}
