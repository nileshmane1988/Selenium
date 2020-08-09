package pattern;
class Gate {
	Gate() {
		System.out.print("1");
		new Gate(10);
		System.out.print("5");
	}

	Gate(int temp) {
		System.out.print("2");
		new Gate(10, 20);
		System.out.print("4");
	}

	Gate(int data, int temp) {
		System.out.print("3");
	}
}

public class ConstructorOverloadingDemo1 {
	public static void main(String args[]) {
		Gate g = new Gate();
	}
}
