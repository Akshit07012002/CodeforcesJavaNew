package codeforces;

import java.io.*;

public class DirectionChange 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		
		
		String s[] = new String[1];
		
		do
		{
			int n = 0, m = 0, add = 0, add2 = 0;
			
			s = in.readLine().split(" ");
			n = Integer.parseInt(s[0]);
			m = Integer.parseInt(s[1]);
			
			if(	n==1 && m-n>1 ) 
			{
				System.out.println(-1); continue;
			}
			if(	m==1 && n-m>1 ) 
			{
				System.out.println(-1); continue;
			}
			
			if(n == m)
				System.out.println((n-1)*2);
			
			if(m>n)
			{
				for(int x=n; x<m; x++)
				{
					if(x%2==0)
						add+=3;
					if(x%2!=0)
						add+=1;
				}
				
				System.out.println( ((n-1)*2) + add);	
			}
				
			if(n>m)
			{
				for(int x=m; x<n; x++)
				{
					if(x%2==0)
						add2+=3;
					if(x%2!=0)
						add2+=1;
				}
				
				System.out.println( ((m-1)*2) + add2);	
			}
			
			
			tc--;
		}while(tc!=0);
	}
}
