package codeforces;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndFeedback 
{
	public static void main (String[] args) throws java.lang.Exception, IOException
	{
	    
	    	Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    String str=in.next();
		    boolean f=false;
		    for(int i=0;i<str.length()-2;i++){
		        if(str.charAt(i)=='1' && str.charAt(i+1)=='0' && str.charAt(i+2)=='1'){
		            f=true;
		            break;
		        }
		        else if(str.charAt(i)=='0' && str.charAt(i+1)=='1' && str.charAt(i+2)=='0'){
		            f=true;
		            break;
		        }  
		    }
		if(f)
		    System.out.println("Good");
		else
		    System.out.println("Bad");
		}
// 		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
// 		int t = Integer.parseInt(in.readLine());
		
// 		String[] s = new String[1];
		
// 		while(t!=0){
		    
// 		    int flag = 0;
// 		    s = in.readLine().split("");
		    
// 		    for(int i=0; i<s.length-3; i++){
// 		        if(s[i].equals("1") && s[i+1].equals("0") && s[i+2].equals("1")){
// 		            flag=1;
// 		            break;
// 		        }
// 		        else if(s[i].equals("0") && s[i+1].equals("1") && s[i+2].equals("0")){
// 		            flag=1;
// 		            break;
// 		        }
// 		    }
// 		    if(flag==1)
// 		        System.out.println("Good");
// 	    	else
// 		        System.out.println("Bad");
            
// 		    t--;
// 		}
	}
}
