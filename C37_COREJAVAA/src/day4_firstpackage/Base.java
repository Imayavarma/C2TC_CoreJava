package day4_firstpackage;

public class Base {
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;

	void methodDefault() {
		System.out.println("Default access Base class");
		System.out.println("Default Variable : " + varDefault);
	}

	public void methodPublic() {
		System.out.println("Public access Base class");
		System.out.println("Public Variable : " + varPublic);
	}

	private void methodPrivate() {
		System.out.println("Private access Base class");
		System.out.println("Private Variable : " + varPrivate);
	}

	protected void methodProtected() {
		System.out.println("Protected access Base class");
		System.out.println("Protected Variable : " + varProtected);
	}
}

class Executor {
	public static void main(String[] args) {

		Base b1 = new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		b1.varDefault = 11;
		b1.methodDefault();

		b1.varProtected = 31;
		b1.methodProtected();
		b1.varPublic = 41;
		b1.methodPublic();

		System.out.println(b1 instanceof Base);

	}
}
