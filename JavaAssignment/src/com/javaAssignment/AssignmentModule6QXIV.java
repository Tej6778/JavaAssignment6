package com.javaAssignment;
//Concate string at the end of another string
import java.util.Scanner;

public class AssignmentModule6QXIV {
public static void main(String[] args) {
	String name1,name2,name3;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Name1");
	name1 = sc.nextLine();
	
	System.out.println("Enter Name2");
	name2 = sc.nextLine();
	
	
	name3 =  name1.concat(name2);
	System.out.println("Concatenated name is "+name3);;
}
}
