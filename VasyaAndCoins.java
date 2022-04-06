package codeforces;

import java.io.*;

public class VasyaAndCoins 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(in.readLine());
		
		long a = 0, b = 0;
		
		String s[] = new String[1];
		
		for(int i=0; i<tc; i++)
		{
			s = in.readLine().split(" ");
			
			a = Long.parseLong(s[0]);
			b = Long.parseLong(s[1]);
			
			System.out.println((a==0)?1:(a+(b*2)+1));
		}
	}
}
