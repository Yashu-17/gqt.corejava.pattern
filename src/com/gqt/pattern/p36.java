package com.gqt.pattern;

import java.util.Scanner;

public class p36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=65;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i-1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)c+" ");
			}
			c++;
			System.out.println();
		}

	}

}
