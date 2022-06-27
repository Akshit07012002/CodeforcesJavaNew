package codeforces;

import java.io.*;
import java.util.*;

public class IntegerDiversity 
{
	public static void main(String []args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		//String []s = new String[1];
		
		Set<Integer> s = new HashSet<Integer>();
		
		int i=0, j=0, flag=0;
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			//s.addAll(in.readLine().split(" "));
			
//			s = in.readLine().split(" ");
//			
//			for(i=0; i<n-1; i++)
//				if(Integer.parseInt(s[i]) != Integer.parseInt(s[i+1]))
//					flag++;
//			
//			if(flag == 0)
//				System.out.println(1);	
//			else
//			{
//				
//				for(i=0; i<n; i++)
//				{
//					if()
//				}
//			}
//			
		}while(t!=0);
	}
}
