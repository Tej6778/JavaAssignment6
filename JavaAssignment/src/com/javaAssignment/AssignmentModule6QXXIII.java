package com.javaAssignment;
/*Question23--WAP to reverse an array of integer values. 
*/
public class AssignmentModule6QXXIII {
public static void main(String[] args) {
int a []=  {1,2,3,4,5};
	
	System.out.println("Original Array");
	for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
	}

	System.out.println("Reverse Array");
	for (int i = a.length-1; i >= 0; i--){
	System.out.println(a[i]);
	}
}
}
