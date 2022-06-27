package codeforces;

import java.io.*;
public class SubtleSubstringSubtraction 
{
	public static void main(String []args)throws IOException
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		for(int i=0; i<tc; i++)
		{
			String s = in.readLine();
			String a = "", b = "";
			
			int lb = 0, ub = 0, l = s.length(), ScoreA = 0, ScoreB = 0;
			
			int ll = 0, uu = 0;
			
			if(i%2==0)
			{
				lb = (int)(Math.random() * (((l-2) - 0) + 1));
				ub = (int)(Math.random() * (((l-1) - lb) + 1)) + lb;
				
				//a = s.substring(lb, ub);
				ScoreA = s.substring(lb, ub).length();
				s = s.substring(ub+1);
			}
			else
			{
				ll = (int)(Math.random() * (((s.length()-2) - 0) + 1));
				uu = (int)(Math.random() * (((s.length()-1) - ll) + 1)) + ll;
				
				ScoreB = s.substring(ll,uu).length();
				s = s.substring(uu+1);
			}
			
			System.out.println( (ScoreA > ScoreB) ? ("Alice " + ScoreA) : ("Bob " + ScoreB) );
			
//		(int)(Math.random() * ((max - min) + 1)) + min
		}
		
	}
}
