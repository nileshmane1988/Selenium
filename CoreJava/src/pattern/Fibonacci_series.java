package pattern;

public class Fibonacci_series {

	public static void main(String[] args) {

		int n1=0,n2=1;
		for (int i=0;i<=5;i++) {
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
		System.out.print(" " +n1);
		}
	}

}
