class Employee {
	private String geekName;
	private int geekId;
	private int geekAge;

	public int getAge() {
		return geekAge;
	}

	public String getName() {
		return geekName;
	}

	public int getId() {
		return geekId;
	}

	public void setAge(int newAge) {
		geekAge = newAge;
	}

	public void setName(String newName) {
		geekName = newName;
	}

	public void setId(int newId) {
		geekId = newId;
	}
}

public class EncapsulationDemo1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		//e1.("Samba");
		e1.setAge(29);
		e1.setId(44);
		System.out.println("Employee name: " + e1.getName());
		System.out.println("Employee age: " + e1.getAge());
		System.out.println("Employee id: " + e1.getId());
	}
}