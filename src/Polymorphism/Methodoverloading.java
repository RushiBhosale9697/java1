package Polymorphism;

public class Methodoverloading {
	public void show() {
		System.out.println("r");
	}
	public void show(int a) {
		System.out.println("u");
	}
	public void show(char a) {
		System.out.println("s");
		
	}
	public void show(int a,char b) {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		
		Methodoverloading mo=new Methodoverloading();
		mo.show();
		mo.show(5);
		mo.show('c');
		mo.show(0, 's');
	}

}
