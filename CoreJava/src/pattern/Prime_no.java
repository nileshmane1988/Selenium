package pattern;

import java.util.Scanner;

public class Prime_no {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i<= n/ 2 ; i++)
		{
			
		if(n % i == 0)
		{
			count++;
		}
		}
		if (count==2)
		{
		System.out.println("given no is prime =" +n);	
		}
		else 
		{
			System.out.println("given no is NOT prime " + n);
		}
		
	}

}
