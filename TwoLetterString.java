package codeforces;

import java.io.*;

public class TwoLetterString 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Long tc = Long.parseLong(in.readLine());
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			String s[] = new String[n];
			for(int i=0; i<n; i++)
				s[i] = in.readLine();
			
			tc--;
		}while(tc!=0);
		
	}
}
