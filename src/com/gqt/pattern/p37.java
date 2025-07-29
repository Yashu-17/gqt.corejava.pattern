package com.gqt.pattern;

import java.util.Scanner;

public class p37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=64;
		for(int i=1;i<=n;i++) {
			c=c+(2*i-1);
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)c+" ");
				c--;
			}
			System.out.println();
			c=64;
		}

	}

}
