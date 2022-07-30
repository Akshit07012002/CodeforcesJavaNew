package codeforces;

import java.util.*;
import java.io.*;

/*
	- You are given a string that may or may not contain repeating characters.
	- Your task is to find out the length of the longest substring of this given string that does not contain any repeating characters.

*/

public class LongestSubstringWithoutRepeat
{
    public static int longestSubstringLength(String str) 
	{

    	int n = str.length();
     
    // Result
        int res = 0;

        for(int i = 0; i < n; i++)
        {

            // Note : Default values in visited are false
            boolean[] visited = new boolean[256];

            for(int j = i; j < n; j++)
            {

                // If current character is visited
                // Break the loop
                if (visited[str.charAt(j)] == true)
                    break;

                // Else update the result if
                // this window is larger, and mark
                // current character as visited.
                else
                {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }

            // Remove the first character of previous
            // window
            visited[str.charAt(i)] = false;
        }
    return res;
	}
    
    public static void main(String[] args)
    {
        String str = "ibnoffjytr";
        System.out.println("The input string is " + str);
     
        int len = longestSubstringLength(str);
        System.out.println("The length of the longest " +
                           "non-repeating character " +
                           "substring is " + len);
    }
}
