package Abstraction;

public class Prashant {
	public static void abc() {
		System.out.println("This is abc method");
	}
	public static void pqr() {
		System.out.println("This is pqr method");
		System.out.println("This is pqr method 2");
	}

	public void lmo () {
		System.out.println("this is lmo method");
		
	}
		
		public static void main(String[] args) {
			Prashant pr=new Prashant();
			pr.lmo();
		Prashant.abc();
		Prashant.pqr();
		
	}

}
