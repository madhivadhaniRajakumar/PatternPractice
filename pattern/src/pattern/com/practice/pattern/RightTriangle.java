package pattern.com.practice.pattern;

import java.util.Scanner;

/*
*
* *
* * *
* * * *
* * * * *
*/
public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}