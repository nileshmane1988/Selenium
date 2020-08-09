package pattern;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		char charr[]= str.toCharArray();
		String rev="";
		
		for (int i = charr.length-1 ; i >=0 ; i--)
		{
			rev = rev + charr[i];
		}
		System.out.println("Given String : "+ str);
		System.out.println("Reverse String : "+ rev);
	
		if(str.equals(rev))
		{
			System.out.println(str +"string is Palindrom");
		}
		else
		{
			System.err.println("string is not palindrom");
		}
	}

}
