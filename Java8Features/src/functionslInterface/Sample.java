package functionslInterface;

public class Sample {
	public static void main(String[] args) {
		FunctionalInterface add=(a,b)->a*b;
		
		FunctionalInterface sub=(a,b)->a+b;
		
		FunctionalInterface mul=(a,b)->a*b;
		
		FunctionalInterface div=(a,b)->a/b;
		
		FunctionalInterface modulus=(a,b)->a%b;
		
		System.out.println(add.math(250,390));
		System.out.println(mul.math(489,29));
		System.out.println(sub.math(378,289));
		System.out.println(div.math(890,67));
		System.out.println(modulus.math(738,89));
	}

}
