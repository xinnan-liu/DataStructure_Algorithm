
public class NumberTheoretic {
	// compute x to the integer power n
	public static double power(double x, int n) {
		double pow = 1;
		
		return pow;
	}

	// compute the greatest common denominator
	public static double gcd(long m, long n) {
		return m; // replace this line!
	}

	// compute x to the integer power n mod m
	public static double powermod(double x, long n, long m) {
		double pow = 1;
		
		return pow;
	}

	// return true if the number p is probably prime as witnessed by a
	public static boolean fermat(long a, long p) {
		
		return false; // replace this line!
	}

	// return true if the number p is probably prime as witnessed by a
	public static boolean millerRabin(long a, long p) {
		
		return false; // replace this line!
	}

	public static void testPrimes() {
		System.out.println(fermat(137, 100001));		
		System.out.println(fermat(192, 2990000031L));		
		System.out.println(fermat(192, 1105));
		System.out.println(fermat(255, 1105));
		System.out.println(fermat(273, 1729));
	}
		
	// just a couple of quick test cases
	public static void main(String[] args) {
		System.out.println(power(2.0, 5));
		System.out.println(power(2.0, 15));
		System.out.println(gcd(5, 3));
		System.out.println(gcd(15, 5));
		System.out.println(gcd(15, 20));
		System.out.println(powermod(2, 270, 1000));
		System.out.println(fermat(137, 100001));		
	}
}
