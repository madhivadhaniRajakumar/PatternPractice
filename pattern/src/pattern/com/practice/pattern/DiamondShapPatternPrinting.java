package pattern.com.practice.pattern;

import java.util.Scanner;

/*
	 *
	***
   *****
  *******
 *********
  *******
   *****
    ***
     *
*/
public class DiamondShapPatternPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ws = n/2;
		int star=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<ws;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			star = star+2;
			ws=ws-1;
			System.out.println();
			if(star>n) {
				star = star-2;
				break;
			}
		}
		ws=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<ws;j++) {
				System.out.print(" ");
			}
			if(star<0) {
				break;
			}
			star = star-2;
			
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			System.out.println();
			ws=ws+1;
		}

	}

}
