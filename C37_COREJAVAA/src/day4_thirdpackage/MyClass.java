package day4_thirdpackage;

public class MyClass {
	private static MyClass obj = new MyClass();
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private MyClass() {
		System.out.println("MyClass object created");
	}

	public static MyClass getObject() {
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
}

 class PrivateConstructorDemo {
	public static void main(String args[]) {
		MyClass m = MyClass.getObject();

		m.setId(10);
		MyClass m1 = MyClass.getObject();
		System.out.println(m);
		System.out.println(m1);
	}
}
