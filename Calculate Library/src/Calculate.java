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
}