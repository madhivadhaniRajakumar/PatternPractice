package pattern.com.practice.pattern;

import java.util.Scanner;

/*
* * * * * 
* * * * 
* * * 
* * 
*
*/
public class DownwordPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = n;
		for(int i=0;i<n;i++) {
			for(int j=-0;j<val;j++) {
				System.out.print("* ");
			}
			System.out.println();
			val = val-1;
		}
		
	}

}
