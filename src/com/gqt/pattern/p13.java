package com.gqt.pattern;

import java.util.Scanner;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int c=i;
			for(int j=1;j<=n;j++) {
				
				System.out.print(c+" ");
				c=c+n;
			}
			System.out.println();
		}


	}

}
