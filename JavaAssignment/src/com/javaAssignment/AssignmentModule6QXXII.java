package com.javaAssignment;
/*Assignment_question22
 WAP to Copy one array into another*/
import java.util.Scanner;

public class AssignmentModule6QXXII {
public static void main(String[] args) {
	int a[] = new int[5];
	Scanner sc = new Scanner(System.in);
	int b[] = new int[5];
	
	System.out.println("Enter Array Element");
	for (int i = 0; i < a.length; i++) { //Enter data in array
	a[i]= sc.nextInt();
	}
	
//	System.out.println("Array Of A Element");
//	for (int i = 0; i < a.length; i++){
//	System.out.println(a[i]);
//	}
	

//	
//	System.out.println("Copy Array");
//	for (int i = 0; i < b.length; i++) {
//	System.out.println(a[i]);
//	}
	
	
	System.out.println("original array");
	for (int i = 0; i < a.length; i++) {
	b[i] = a[i];
	}
	
	//Display
	for (int i = 0; i < a.length; i++)	{
	System.out.println(a[i]);
	}
	
	System.out.println("copy array");
	
	for (int i = 0; i < b.length; i++)	{
	System.out.println(b[i]);
	}

}
}
