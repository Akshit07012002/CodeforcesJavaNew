package codeforces;

import java.io.*;

public class ProgLang {

	public static void main(String[] args)throws IOException, java.lang.Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		String s[] = new String[1];
		
		int total = 0;
		
		do
		{
			s = in.readLine().split(" ");
			
			String one = s[0] + s[1];
			String two = s[1] + s[0];			
			
			String temp1 = s[2] + s[3];
			String temp2 = s[3] + s[2];
			
			String temp3 = s[4] + s[5];
			String temp4 = s[5] + s[4];
			
			int ans = 0;
			
			if(one.equals(temp1) || one.equals(temp2) || two.equals(temp1) || two.equals(temp2) )
				ans = 1;
			
			if(one.equals(temp3) || one.equals(temp4) || two.equals(temp3) || two.equals(temp4) )
				ans = 2;
			
			System.out.println(ans);
			t--;
		}while(t!=0);
		
		
	}
}
