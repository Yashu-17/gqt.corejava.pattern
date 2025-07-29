/**
 * 
 */
package newpatterns;

import java.util.Scanner;

/**
 * My name YASHWANTH
 */
public class namep6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			// y
			
			for(int j=0;j<n;j++) {
				if(j==n/2&& i>=n/2 || i==j&& i<=n/2 || ((j+i)==n-1)&&i<=n/2 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//A
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n/2) || j==(n-1)  ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//s
			
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1)  || (j==(n-1)&&i>=n/2) || j==0&&i<=n/2 || i==n/2 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//H
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==(n/2)  ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//W
			for(int j=0;j<n;j++) {
				if(j==0 || i==j&&i>=n/2 || j==(n-1) || ((i+j)==(n-1))&& i>=n/2 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//A
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n/2) || j==(n-1)  ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//N
			for(int j=0;j<n;j++) {
				if(i==j || j==0  ||j==(n-1) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//T
			
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n/2) ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//H
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==(n/2)  ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("    ");
			sc.close();
			
		}

	}

}
