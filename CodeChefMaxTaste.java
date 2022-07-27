package codeforces;

import java.io.*;

public class CodeChefMaxTaste {
	
	public static void main (String[] args) throws java.lang.Exception, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String[] s = new String[1];
		int maxOne = 0, maxTwo = 0;
		
	    for(int i=0; i<t; i++){
	        
	    	s = in.readLine().split(" ");
	    	
	    	maxOne = (int) Math.max(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
	    	maxTwo = (int) Math.max(Integer.parseInt(s[2]), Integer.parseInt(s[3]));
	        System.out.println(maxOne + maxTwo);
	    }
	}

}
