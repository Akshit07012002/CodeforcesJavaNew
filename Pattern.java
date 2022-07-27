package codeforces;

import java.io.*;

public class Pattern {

	public static void main(String[] args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
//		int m = Integer.parseInt(in.readLine());

		
		// left skewed triangle
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n-i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		//left skewed triangle : solution 2
		for(int i=0; i<n; i++) {
			
			for(int j=i; j<n; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		//right skewed triangle 
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=i; k<n; k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		//right skewed triangle with odd pattern
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=i; k<n; k++) {
				if(k%2==0)System.out.print("•");
				else System.out.print("o");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int check = 0;
		//right skewed triangle with alternate even-odd pattern
		for(int i=0; i<n; i++) {
			check = (check==0) ? (check = 1) : (check = 0);
			for(int j=0; j<i; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=i; k<n; k++) {
				if(k%2==check)System.out.print("•");
				else System.out.print("o");
			}
			
			System.out.println();
		}
	}

}
