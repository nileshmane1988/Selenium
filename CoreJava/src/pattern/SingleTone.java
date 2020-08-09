package pattern;

public class SingleTone {

	public static void main(String[] args) {

		A obj1 = A.getA();
		A obj2 = A.getA();
		
		obj1.disp();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
	}

}
