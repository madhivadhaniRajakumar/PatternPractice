package pattern.com.practice.pattern;

import java.util.Scanner;

/*
    * 
   * * 
  * * * 
 * * * * 
* * * * *			


*/
public class PyramidProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		for(int i=1;i<=n;i++) {
			for(int k=0;k<space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			space = space-1;
		}
	}
}
