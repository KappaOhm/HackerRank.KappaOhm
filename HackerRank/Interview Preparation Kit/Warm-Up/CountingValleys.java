/*
Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. 
During his last hike he took exactly n steps. For every step he took, he noted if it was an uphill, U, or a downhill, D step. 
Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude. 

We define the following terms:

A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.

For example, if Gary's path is s=[D D U U U U D D], he first enters a valley 2 units deep. Then he climbs out an up onto a mountain 2 units high. 
Finally, he returns to sea level and ends his hike.
*/

import java.io.*;
import java.util.*;


public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) 
    {
        int level = 0, temp1 =0, temp2 = 0;

        for(int i = 0; i < n; i++)
        {
            if(level == 0 && s.charAt(i)=='D')
            {
                temp1++; level--;
            } 
            else if(level == -1 && s.charAt(i)=='U')
            {
                temp2++; level++;
            }
            else if(s.charAt(i)=='D')
            {
                level--;
            }
            else
            {
                level++;
            }
        }

        return (temp1+temp2)/2;
    }

    public static void main(String[] args) {
       
        Scanner ask = new Scanner(System.in);
        int n = ask.nextInt();
        String s = ask.next();

        int result = countingValleys(n, s);
        System.out.println(result);
        
    }
}
