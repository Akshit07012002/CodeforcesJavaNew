package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeChefValidMin {
	public static void main (String[] args) throws java.lang.Exception, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String[] s = new String[1];
		int a = 0, b = 0, c = 0;
		int x = 0, y = 0;
		
		int check = 0;
		
	    for(int i=0; i<t; i++){
	        
	    	s = in.readLine().split(" ");
	    	
	    	a = (int) Math.max(Integer.parseInt(s[0]), Math.max(Integer.parseInt(s[1]), Integer.parseInt(s[2])));
	    	x = (int) Math.min(Integer.parseInt(s[1]), a);
	    	
	    	
	    	if((int) Math.min(Integer.parseInt(s[1]), a) == Integer.parseInt(s[0]))
	    		check++;    	
	    	
	    	if(check == 1)
	    		System.out.println("YES");
	    	else
	    		System.out.println("NO");
//	    	System.out.println(check + " " + a + " " + x + " " + y);
	    	
	    	check = 0;
	    }
	}

}
