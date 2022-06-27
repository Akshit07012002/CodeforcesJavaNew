package codeforces;

import java.io.*;

public class Codechef2 {

	public static void main(String[] args)throws IOException, java.lang.Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		
		int total = 0;
		
		do
		{
			s = in.readLine().split(" ");
			
			total += Integer.parseInt(s[0]) * 10;
			total += Integer.parseInt(s[1]) * 90;
			
			System.out.println(total);
			
			total = 0;
			t--;
		}while(t!=0);
		
		
	}
}
