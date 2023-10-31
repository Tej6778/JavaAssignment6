package com.javaAssignment;
//average value of array element
public class AssignmentModule6QX {
public static void main(String[] args) {
	int a[]= new int [] {10,20,30,40};
	int k=0;
	for (int i = 0; i < a.length; i++) {
	k=k+a[i];
	}
	int avg= k/a.length;
	System.out.println("The average value of an array element is "+ avg);
	
	
}
}
