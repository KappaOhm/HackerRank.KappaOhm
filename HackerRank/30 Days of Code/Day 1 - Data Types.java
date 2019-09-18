/*
Objective
Today, we're discussing data types. Check out the Tutorial tab for learning materials and an instructional
video!
Task
Complete the code in the editor below. The variables i, d, and s are already declared and initialized for
you. You must:
1. Declare 3 variables: one of type int, one of type double, and one of type String.
2. Read 3 lines of input from stdin (according to the sequence given in the Input Format section below)
and initialize your 3 variables.
3. Use the + operator to perform the following operations:
1. Print the sum of i plus your int variable on a new line.
2. Print the sum of d plus your double variable to a scale of one decimal place on a new line.
3. Concatenate s with the string you read as input and print the result on a new line.
*/

import java.io.*;
import java.util.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int j = scan.nextInt();
        double k = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + k);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + c);

        scan.close();
    }
}