package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseclassMethods();
		BaseClass base = new BaseClass();
		base.add(4, 5);
	}

	public static void baseclassMethods() {
		System.out.println("Dhivagar modified logic");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(String a, String b, String c) {
		System.out.println(a + b + c);
	}
}
