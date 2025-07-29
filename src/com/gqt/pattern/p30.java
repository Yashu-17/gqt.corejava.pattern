package com.gqt.pattern;

import java.util.Scanner;

public class p30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(j+1+" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(j+" ");
			}
			for(int j=n-i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
