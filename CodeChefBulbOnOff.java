package codeforces;

import java.io.*;

public class CodeChefBulbOnOff {

	public static void main (String[] args) throws java.lang.Exception, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String[] s = new String[1];
		String[] r = new String[1];
		
	    for(int i=0; i<t; i++){
	    	
	    	int changes = 0;
	        
	    	int n = Integer.parseInt(in.readLine());
	    	
	    	s = in.readLine().split(" ");
	    	r = in.readLine().split(" ");
	    	
	    	int j = 0;
	    	
	    	while(j<n) {
	    		if( s[0].charAt(j) != (r[0].charAt(j)) )
	    			changes++;
	    		j++;
	    	}
	    	
	    	int ans = (changes%2==0) ? 1 : 0; 
	    	
	        System.out.println(ans);
	    }
	}
}
