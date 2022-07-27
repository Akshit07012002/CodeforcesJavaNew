package codeforces;

import java.io.*;

public class CodeChefHotOrCold {
	public static void main (String[] args) throws java.lang.Exception, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
	    for(int i=0; i<t; i++){
	        
	        int c = Integer.parseInt(in.readLine());
	        
	        String ans = (c>20) ? "HOT" : "COLD";
	        
	        System.out.println(ans);
	    }
	}
}
