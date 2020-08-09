package pattern;
import java.util.Scanner;

public class Palindron {
	public static void main(String[] args) {
		int no=123456;int count = 0;
		int rem=0,temp=0;
		while(no > 0) {
			rem = no%10;
			temp = temp*10 +rem;
			System.out.println(temp);
			no = no/10;
			
			count ++;
			System.out.println(count);

	
		}
		System.out.println(temp);
		
		System.out.println("=============StringPalindron===== MADAM==========");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		String str=sc.next();
		
		int ii=Integer.parseInt(str);		
		System.out.println("ii="+ii);
			
			
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			char temp2 = str.charAt(i);
			rev=rev + temp2;
		}
		System.out.println(rev);
		
		
	
		
	}
	

}
