package constructor;

public class Parametertized {
	public Parametertized (long a ) {
		System.out.println("this is parameterizesd constructor");
		
	}
	public Parametertized (int a ) {
		System.out.println("this is parameterizesd constructor1");
		
	}

	public static void main(String[] args) {
		Parametertized pa=new Parametertized(1000l);
		Parametertized pa1=new Parametertized(1);

	}

}
