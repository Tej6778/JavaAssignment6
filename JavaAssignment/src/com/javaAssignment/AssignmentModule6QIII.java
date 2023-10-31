//3)Factorial of given number;

package com.javaAssignment;
import java.util.Scanner;

public class AssignmentModule6QIII {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter a number");
int m=sc.nextInt();
int n=1;

for (int i = 1; i<=m; i++) {
n=n*i;
System.out.print(n+", ");		//ans will be :-1,2,6,24,120
}
//System.out.println(n);	//ans will be:- 120


}
}
