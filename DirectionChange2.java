package codeforces;

import java.io.*;

public class DirectionChange2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		
		do
		{
			int n = 0, m = 0, diff = 0;
			
			s = in.readLine().split(" ");
			n = Integer.parseInt(s[0]);
			m = Integer.parseInt(s[1]);
			
			diff = n-m;
			if((n-m)<0)
				diff = m-n;
			if(	n==1 && m>2 || m==1 && n>2 ) 
			{
				System.out.println(-1); continue;
			}
			if(	m==1 && n==1 ) 
			{
				System.out.println(0);	continue;
			}
			
			else
			{
				int min = n>m?m:n;
				long result = 2*min-2;
				
				if(diff==1)
					result+=1;
				else
				{
					if((diff&1)!=0)
						result+=2*diff-1;
					else
						result+=2*diff;
				}
				System.out.println(result);
			}
			
			tc--;
			
		}while(tc>0);
	}
}
