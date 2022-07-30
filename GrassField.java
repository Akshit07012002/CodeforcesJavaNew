package codeforces;

import java.io.*;

public class GrassField {
	
	public static void main(String[] args)throws IOException{
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] one = new String[1];
		String[] two = new String[1];
		
		int t =Integer.parseInt(in.readLine());
		
		while(t!=0) {
			
			one = in.readLine().split(" ");
			two = in.readLine().split(" ");
			
			int count = 0;
			for(int i=0; i<2; i++) {
				if(Integer.parseInt(one[i]) == 1)
					count++;
				if(Integer.parseInt(two[i]) == 1)
					count++;
			}
			int ans = (count>3) ? 2 : (count>0) ? 1 : 0;
			
			System.out.println(ans);
			
			t--;
			
		}
	
	}
}
