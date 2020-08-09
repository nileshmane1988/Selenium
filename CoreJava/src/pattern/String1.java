package pattern;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Programming";
		System.out.println("Approch - 1 ");
		System.out.println("lenght of string : "+ str.length());
		
		System.out.println("\nApproch - 2 ");
		char[] charr= str.toCharArray();
		int count=0;
		for(int i=0;i<=charr.length-1;i++)
		{
			count++;
		}

		System.out.println("length of string :"+ count);
	}

}
