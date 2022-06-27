package codeforces;

import java.io.*;

public class Sample34SA {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		s = in.readLine().split(" ");
		
		int min = (int) Math.abs(Integer.parseInt(s[n-1]) - Integer.parseInt(s[0]));
		
		//int min = Integer.MAX_VALUE;
		int x = n, y = 1;
		
		for(int i=0; i<n-1; i++)
		{
			if((int) Math.abs(Integer.parseInt(s[i]) - Integer.parseInt(s[i+1])) < min)
			{
				min = (int) Math.abs(Integer.parseInt(s[i]) - Integer.parseInt(s[i+1]));
				
				x = i+1; y = i+2;
			}
			
		}
		
		System.out.println(x + " " + y);

	}

}
