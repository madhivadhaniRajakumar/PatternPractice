package pattern.com.practice.pattern;

import java.util.Scanner;

/*
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 
*/
public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			space = space-1;
			System.out.println();
		}
		
	}

}
