package com.javaAssignment;
//max or min value of an array
public class AssignmentModule6QXII {
public static void main(String[] args) {
    int[] array = {54, 43, 66, 18, 3, 99};

    int max = array[0]; // Assume the first element is the maximum initially
    int min = array[0]; // Assume the first element is the minimum initially

    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i]; // Update maximum value
        }

        if (array[i] < min) {
            min = array[i]; // Update minimum value
        }
      
    }
    
    System.out.println("Maximum value: " + max);
    System.out.println("Minimum value: " + min);

}
}
