package com.javaAssignment;

import java.util.Scanner;

//write a program to find the index of an array element
public class AssignmentModule6QXI {
public static void main(String[] args) {
	
	int [] a = {2,5,9,10,8};
	Scanner scanner = new Scanner(System.in);
	int find ;
	int index=0;
	
	System.out.println("Array element is : ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+",");
	}
		System.out.println();
	
		System.out.println("Enter the array element to find index : ");
		find = scanner.nextInt();
	
	for (int i = 0; i < a.length; i++){
		if (a[i]==find)	{
			index = i;
		}
	}
	System.out.println("index number is : "+index);
//	System.out.println("index number is : "+ a[3]);
	
}
}
