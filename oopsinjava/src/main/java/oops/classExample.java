package oops;

public class classExample {
	
	public static int gcd(int num, int den){
		int min = Math.min(num, den);
		for(int i=min;i>=1;i--) {
			if(num%i==0 && den%i==0) {
				return i;
			}
		}
		return 1;
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int numerator = (f1.num*f2.den)+(f2.num*f1.den);
		int denominator = f1.den*f2.den;
		Fraction f3 = new Fraction(numerator, denominator);
		return f3;
	}

	public static Fraction multiply(Fraction f1, Fraction f2) {
		int numerator = f1.num*f2.num;
		int denominator = f1.den*f2.den;
		Fraction f4 = new Fraction(numerator, denominator);
		return f4;
	}
	public static class Fraction{
		int num;
		int den;
		
		// Constructor
		public Fraction(int num, int den) {
			this.num = num;
			this.den = den;
			// to make every num and den simplify by default - hence adding it in constructor
			Simplify();
		}
		
		// Simplify to lowest terms - num/gcd and den/gcd
		public void Simplify() {
			int k = gcd(num,den);
			num /= k;
			den /= k;
		} 
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(14, 21);
		Fraction f2 = new Fraction(6, 20);
		System.out.println(f1.num+"/"+f1.den); // Ans = 2/3
		System.out.println(add(f1, f2).num+"/"+add(f1, f2).den);
		System.out.println(multiply(f1, f2).num+"/"+multiply(f1, f2).den);
	}

}
