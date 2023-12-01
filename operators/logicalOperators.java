package test;

public class Example {
	public static void main(String[] args) {
		boolean con1 = true;
		boolean con2 = false;
		boolean res1 = con1 && con2;
		boolean res2 = con1 || con2;
		boolean res3 = !con2;
		System.out.println(res1); // false
		System.out.println(res2); // true
		System.out.println(res3); // true
	}
}