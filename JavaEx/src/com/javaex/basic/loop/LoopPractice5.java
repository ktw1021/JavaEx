package com.javaex.basic.loop;

public class LoopPractice5 {

	public static void main(String[] args) {
		
		int a= 0;
		int b = 0;
		
		while (b!=1) {
			a++;
			if ((a%6==0) && (a%14==0)) {
				System.out.println(a);
				b=1;
				}	
			}
		
		int l = 0;
		while (true) {
			l++;
			if ((l%6==0) && (l%14==0)) {
				System.out.println(l);
				break;
				}	
			}
		
		int p = 0;
		do {
			p++;
		do {
			p++;
			} while (p%6!=0);
		} while(p%14!=0);
		System.out.println(p);
		
		
		int c = 1;
		for(; ; c++) {
				if ((c%6==0) && (c%14==0)) {
					System.out.println(c);
					break;
					}	
				}
		
		int g = 1;
		int d = 1; 
		for(; g==1; ) {
			d++;
				for (; d%6==0 && d%14==0; ) {
					g =0;
					System.out.println(d);
					break;
					}
				}
			
		
	}

}
