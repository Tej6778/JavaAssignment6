package com.javaAssignment;
/*WAP to find the second largest element in an array*/
public class AssignmentModule6QXXIV {
public static void main(String[] args) {
	int T,size=5;
	int a[] = {11,34,78,97,22};
	size= a.length;
	System.out.println(size);
	
	for (int i = 0; i < size; i++){
	for (int j = i+1; j < size; j++) {
	if(a[i]>a[j]){
				
				T = a[i];
				a[i]= a[j];
				a[j]= T;
	}
	}
	}
	
	System.out.println("Third second largest number is:: "+a[size-2]);
	
}
}
