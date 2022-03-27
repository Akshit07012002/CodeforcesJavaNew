package codeforces;

import java.io.*;
import java.util.*;

public class PolycarpPockets 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		HashMap <Integer, Integer> map = new HashMap<>();
		
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			if(map.containsKey(Integer.parseInt(s[i])))
				map.replace(Integer.parseInt(s[i]), map.get(Integer.parseInt(s[i])) + 1);
			else
				map.put(Integer.parseInt(s[i]), 1);
		}
		
		int maxValueInMap=(Collections.max(map.values())); 
		System.out.print(maxValueInMap);
	}
}
