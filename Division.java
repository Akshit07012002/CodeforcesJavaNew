package codeforces;

import java.io.*;

public class Division 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Long tc = Long.parseLong(in.readLine());
		
		do
		{
			
			int r = Integer.parseInt(in.readLine());
			
			if(r>=1900)
				System.out.println("Division 1");
			
			if(r>=1600 && r<=1899)
				System.out.println("Division 2");
			
			if(r>=1400 && r<=1699)
				System.out.println("Division 3");
			
			if(r<=1399)
				System.out.println("Division 4");
			
			tc--;
		}while(tc!=0);
			
	}
}
