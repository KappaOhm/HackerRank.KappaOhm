/*
Objective
In this challenge, you'll work with arithmetic operators. 

Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        
        meal_cost = meal_cost*((double)tip_percent/100) + meal_cost*((double)tax_percent/100) + meal_cost;

        System.out.println(Math.round(meal_cost));
// 
        scanner.close();
    }
}
