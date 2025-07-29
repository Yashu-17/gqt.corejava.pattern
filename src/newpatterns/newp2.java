/**
 * 
 */
package newpatterns;

import java.util.Scanner;

/**#
 * #-#
 * #--#
 * #---#
 * ######
 */
public class newp2 {

	/**
	 *  @author yashu
 * @category Conditional Patterns
 * @description This is an example for conditional pattern-2
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==n-1|| j==0|| j==i) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
					
				}
			}System.out.println();
			
		}
	}
	
}
	
