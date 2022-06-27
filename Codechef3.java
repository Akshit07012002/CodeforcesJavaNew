package codeforces;

import java.io.*;

public class Codechef3 {

	public static void main(String[] args)throws IOException, java.lang.Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		
		int total = 0;
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			long max = 0;
			
			int nz = 0;
			
			s = in.readLine().split(" ");
			
			for(int i=0; i<n; i++)
			{
				if(Long.parseLong(s[i])==0)
					continue;
				else
					nz = i;
			}
		
			t--;
		}while(t!=0);
		
		
	}
}
