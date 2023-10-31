package com.javaAssignment;

import java.util.Scanner;

//write a program to sum value of an array
public class AssignmentModule6QIX {
public static void main(String[] args) {

	int [] a = new int[5];
	Scanner sc = new Scanner(System.in);
	int k=0;
	
	for (int i = 0; i <a.length; i++){
		System.out.println("Enter a number:");
		a[i] = sc.nextInt();
		k=k+a[i]; 
	}
	System.out.println("Sum of array value is : "+k);
}
}
/*here firstly we defined a as an array having 5 compartments therefore its length will be 5 i.e.,
 * a.lenght will be 5 & its index number will be 0,1,2,3,4. 
 * then scanner class & int k having o value;
 * 
 * than for loop here i is index number starts from 0 i.e., for first compartments value 
 */


