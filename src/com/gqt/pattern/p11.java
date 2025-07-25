package com.gqt.pattern;

import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++) {
				System.out.print(c+" 5");
				c++;
				
			}
			System.out.println();
		}


	}

}
