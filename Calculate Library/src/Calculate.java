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
	}
