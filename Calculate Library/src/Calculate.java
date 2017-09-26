/* Maurice Jiang
   September 5 2017
   This is our library that contain mathematical library
*/
public class Calculate {
	/*
	 * This method takes an integer and returns its square
	 */
	public static int square(int a) {
		return a * a;
	}

	public static int cube(int b) {
		return b * b * b;
	}

	public static double average(double c1, double c2) {
		return (c1 + c2) / 2;
	}
	public static double average1(double d1, double d2, double d3) {
		return (d1 + d2 + d3) / 2;
	}
	public static double toDegrees(double e) {
		return ((180/3.14159)*e);
	}
	public static double toRadian(double f) {
		return ((3.14159/180)*f);
	
	}
	public static double discriminant(double g1, double g2, double g3) {
		return ((g2 * g2)-4 * g1 * g3);
	}
	public static String toImproperFrac(int h1, int h2, int h3) {
		int h4 = h1*h3+h2;
		return (h4 + "/"+ h3);
		
	}
	public static String toMixedNum(int i1, int i2) {
		int i3 = i1/i2;
		int i4 = i1%i2;
		return (i3+" "+i4+"/"+i2);
	}
	public static String foil(int j1, int j2, int j3, int j4) {
		int j5 = j1 * j3;
		int j6 = (j1*j4)+(j2*j3);
		int j7 = j2*j4;
		return (j5+"n^2"+" "+"+"+" "+j6+"n"+" "+j7);
	}
	public static boolean isDivisibleBy(int k1, int k2) {
		if (k1 % k2 == 0) {
			return true;
		} else {
			return false;
		}
	
	}
	public static double absValue(double l1) {	
		if (l1 >= 0) {
			return l1;
	}	else {
			return -l1;
}
	}

	public static double max(double m1, double m2) {
		if (m1 > m2) {
			return m1;
	}   else {
			return m2;
	}
	}
	public static double max (double n1, double n2, double n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
	}	else if (n2 > n1 && n2 > n3){
			return n2;
	}
		else {
			return n3;
		}
	}

	public static int min(int o1, int o2) {
		if (o1 > o2) {
			return o1;
	}	else {
			return o2;
		}
	}
	public static double round2(double number){
        if(number < 0){//rounds a number that is negative
            number *= -1;//converts the number to a positive number
            if(number * 1000 % 10 < 5){
                number = (number * 1000 - number * 1000 % 10) / 1000;
            }
            else{
                number = (10 - number * 1000 % 10 + number * 1000) / 1000;
            }
            number *= -1;//converts the number back to a negative number
            return number;
        }
        else{//rounds a number that is positive
            if(number * 1000 % 10 < 5){
                return (number * 1000 - number * 1000 % 10) / 1000;
            }
            else{
                return (10 - number * 1000 % 10 + number * 1000) / 1000;
            }
        }
    }
	public static double exponent(double q1, int q2) {
		double answer=q1;
		for(int i=1; i<q2; i++) {
			answer=q1*answer;
		}
		return answer;
	}
	public static int factorial(int number) {
		  int product = 1;
	        if(number == 0){
	            return 1;
	        }
	        for(int i = 1; i <= number; i++){
                product *= i;
            }
            return product;

	}
	public static boolean isPrime(int number){
		for(int i=2; i < number; i++);
		if(s % i != 0){
			return true;
		}else {
			return false;
		}
	public static int gcf(int number1, int number2){
		for(int i=2; i < number1; i++);
			for(int j=2
	
}
