package pattern;

class Sample {
	Sample(){
		System.out.println("defoult constracter");
	}
	int Sample(int a) {
		System.out.println("int method");
		return a;
	}

	Sample(int a) {
		System.out.println("int const");
		// return a;

	}
}

class MainClass {
	public static void main(String[] args) {

		
		Sample s1 = new Sample();
		s1.Sample(0);
		System.out.println("\n\t"+new Sample(200)); 
		

	}
}