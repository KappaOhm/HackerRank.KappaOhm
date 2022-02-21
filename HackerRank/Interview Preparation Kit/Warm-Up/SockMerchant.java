/*
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. 
Given an array of integers representing the color of each sock, 
determine how many pairs of socks with matching colors there are.

For example, there are n socks with colors ar =[1, 2, 1, 2, 1, 3, 2]. 
There is one pair of color1  and one of color 2. 
There are three odd socks left, one of each color. The number of pairs is 2.

Complete the sockMerchant function in the editor below. 
It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int pairs=0;

        Scanner ask = new Scanner(System.in);
        int[] colors = new int[101];
        int n = ask.nextInt();

        for(int i=0; i<n; i++)
        {
            int color=ask.nextInt();
            colors[color]++;
            if(colors[color]%2 == 0){
                pairs++;
                colors[color] = 0;
            }
        }
        System.out.println(pairs);
    }
}
