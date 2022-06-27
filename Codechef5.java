package codeforces;

import java.io.*;

public class Codechef5 {

	public static void main(String[] args)throws IOException, java.lang.Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		
		int total = 0;
		
		do
		{
			int n = Integer.parseInt(in.readLine());
			
			s = in.readLine().split(" ");
			
			System.out.println( (int) Math.max(Integer.parseInt(s[0]), Math.max(Integer.parseInt(s[1]), Math.max(Integer.parseInt(s[2]), Integer.parseInt(s[3]))))  );
			
			t--;
		}while(t!=0);
		
		
	}
}
