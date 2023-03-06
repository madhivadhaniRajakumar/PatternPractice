package pattern.com.practice.pattern;

import java.util.Scanner;

/*
1
6 2
10 7 3
13 11 8 2
15 14 12 9 5
*/
public class numberTrianlePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val=1;
		for(int i=0;i<n;i++) {
			int t=n-i;
			
			System.out.print(val+" ");
			int p = val;
			for(int j=0;j<i;j++) {
				 p = p-t;
				System.out.print(p+" ");
				t++;
			}
			val = val + n-i;
			System.out.println();
		}
	}

}
