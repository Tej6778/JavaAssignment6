package com.javaAssignment;

import java.util.Scanner;

//4)to check whether the given number is prime or not
public class AssignmentModule6qIV {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

System.out.println("Enter a number");
int m=sc.nextInt(), n=1;

for (int i = 2; i < m; i++) {  
if (m%i==0) {
	n=0;
}
}
if (n==0) {
System.out.println("not a prime number");	
}else {
System.out.println("prime number");
}

	
	
	
	
	
	
}
}
