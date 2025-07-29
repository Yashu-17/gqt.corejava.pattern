package com.gqt.pattern;

import java.util.Scanner;

public class p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(b+" ");
					
				}
				else {
					System.out.print(a+" ");
				}
				
			}
			System.out.println();
		}
		

	}

}
