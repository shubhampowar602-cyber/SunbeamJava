package Loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the nth term");
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=1;count<=n;i+=2) {
			
			System.out.println(i);
			count++;
			
			
			
			 
		}
		
		
	}
	
	
}
