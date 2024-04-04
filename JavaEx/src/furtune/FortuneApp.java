package furtune;

import java.util.Scanner;

public class FortuneApp {

	public static void main(String[] args) {
		char [][] yourBirth = new char[2][4]; 
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("천간: 시일월년");
		String gan = sc.next();
		char [] a = gan.toCharArray();
		
		System.out.println("지지: 시일월년");
		String ji = sc.next();
		char [] b = ji.toCharArray();
		for (int j = 0; j<4; j++) {
			yourBirth[0][j]=a[j];
			yourBirth[1][j]=b[j];
		}
	    for (int i = 0; i < 4; i++) {
	       	System.out.print(yourBirth[0][i]+"\t");
	}	System.out.println();
       	for (int i = 0; i<4; i++) {
       	System.out.print(yourBirth[1][i]+"\t");
	}
       	
       	
	
	}
}
