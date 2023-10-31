package com.javaAssignment;

import java.util.ArrayList;

//WAP to update specific array element by given element

public class AssignmentModule6QXX {
public static void main(String[] args) {

	ArrayList A= new ArrayList();
	
	A.add("Tejas");
	A.add(7);
	A.add(12.12);
	A.add("$");
	System.out.println("Before upadating the arraylist " +A);
	
	A.set(0, 1);
	A.set(1, "Tej");
	A.set(2, "$");
	A.set(3, "1200");
	
	System.out.println("After upadating the arraylist " +A);
	
}
}
