package codeforces;

/*
 *  CUSTOM INPUT
 *  5
 *  5
 *  apple
 *  15
 *  schtschurowskia
 *  6
 *  polish
 *  5
 *  tryst
 *  3
 *  cry
 */

import java.util.*;
import java.io.*;

class CodeChefEasyPronunciation 
{
	public static void main (String[] args) throws java.lang.Exception, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String[] s = new String[1];
		
		Set<String> set = new HashSet<>(Arrays.asList("a","e","i","o","u"));
		
		while(t!=0){
		    
		    int n = Integer.parseInt(in.readLine());
		    
		    s = in.readLine().split("");
		    
		    String ans = "Yes";
		    
		    int count = 0;
		    
		    for(int i=0; i<n; i++){
		        if(!set.contains(s[i])){
		            count++;
		            if(count>=4){
		                ans = "No";
		                break;
		            }
		        }
		        else
		            count=0;
		    }
		        
		    System.out.println(ans);
		        
		    t--;
		}
	}
}
