package com.javaAssignment;
//WAP to remove the third element from a array list.

import java.util.ArrayList;

public class AssignmentModule6QXXI {
public static void main(String[] args) {
	
	ArrayList a1 = new ArrayList();
	
	a1.add("Tejas");
	a1.add("Tej");
	a1.add(111);
	a1.add("$%");
	
	System.out.println("Actual Array list is .."+a1);
	
	a1.remove(2);
	System.out.println("Removing the third element from actual array list is .."+a1);	
}
}
