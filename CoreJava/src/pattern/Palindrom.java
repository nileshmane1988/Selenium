package pattern;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter  no = ");
		int n = sc.nextInt();
		int r=0 ;
		int sum = 0;
		int temp = 0;
		temp = n;
		while(temp >0)
		{
			r= temp %10;
			sum = sum *10  + r;
			temp = temp /10;	
		}
		System.out.println("enter no = " + n);
		System.out.println("reversed no = " + sum);
		if(sum == n)
		{
			System.out.println("Palimdron");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}

}
