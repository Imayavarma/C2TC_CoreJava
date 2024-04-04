package day4CoreJava;

public class Base {
	int varDefault = 10;
	private int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;

	void methodDefault() {
		System.out.println("Default access Base Class");
		System.out.println("Default Variable :" + varDefault);

	}

	public void methodpublic() {
		System.out.println("Public access Base class");
		System.out.println("Public Variable:" + varPublic);

	}

	private void methodPrivate() {
		System.out.println("private accesss Base Class");
		System.out.println("Protected Variable:" + varProtected);

	}

}
  