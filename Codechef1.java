package codeforces;

import java.io.*;

public class Codechef1 {

	public static void main(String[] args)throws IOException, java.lang.Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = in.readLine().split(" ");
		
		int count = 4;
		
		for(int i=0; i<4; i++)
			if(Integer.parseInt(s[i]) < 10)
				count--;

		System.out.println(count);
	}

}
