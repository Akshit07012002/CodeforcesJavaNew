package codeforces;

import java.io.*;

public class MaxInTable 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int a[][] = new int[n][n];
		
		int i, j;
		
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{
				if(i==0 || j==0)
					a[i][j] = 1;
				
				else
					a[i][j] = a[i-1][j] + a[i][j-1];
				
			}
		}
		
		System.out.println(a[n-1][n-1]);
	}
}
