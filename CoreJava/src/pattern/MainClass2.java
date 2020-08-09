package pattern;

//Which of these can be used to differentiate two or more methods having same name?

class Sample2 {
	int mul(int a) {
		System.out.println("int 1");
		return a;
	}

	int mul(double a) {
		System.out.println("double const");
		 return (int)a;

	}
}

class MainClass2 {
	public static void main(String[] args) {

		
		Sample2 s1 = new Sample2();
		System.out.println(s1.mul(021.2));
		
		System.out.println(new Sample2()); 
		

	}
}