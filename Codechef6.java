package codeforces;

import java.io.*;

public class Codechef6 {

	public static void main(String[] args)throws IOException, java.lang.Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		
		int total = 0;
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			s = in.readLine().split(" ");
			
			int mid = s.length/2, flag = 0;
		
			for(int i=0; i<mid; i++)
			{
				if(Integer.parseInt(s[i]) != Integer.parseInt(s[n-1-i]))
				{
					flag = 1; break;
				}
			}
			
			if(flag == 1)
				
			
			t--;
		}while(t!=0);
		
		
	}
}
