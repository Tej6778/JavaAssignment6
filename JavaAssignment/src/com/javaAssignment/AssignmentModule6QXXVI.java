package com.javaAssignment;

import java.util.Scanner;

/*write a java program which will asks the user to enter his/her marks(out of 100).
 Defien a method that will display grades according to the marks*/

public class AssignmentModule6QXXVI {
public static void main(String[] args) {
	
Scanner sc= new Scanner(System.in);	
System.out.println("Enter marks out of 100");
int marks=sc.nextInt();

	if (marks>90 || marks==100) {
		System.out.println("Grade=AA ! Excellent");	
}	else if (marks>80 || marks==90) {
		System.out.println("Grade=AB ! Excellent");	
}	else if (marks>70 || marks==80) {
		System.out.println("Grade=BB ! Very Good");
}	else if (marks>60 || marks==70) {
		System.out.println("Grade=BC ! Good");
}	else if (marks>50 || marks==60) {
		System.out.println("Grade=CD ! Work Hard");
}	else if (marks>40 || marks==50) {
	System.out.println("Grade=DD ! Really Need to Work Hard");
}	else {
	System.out.println("Fail You Fool");
}
		
}
}
