/*Maurice Jiang
 * September 5 2017
 * This is my runner for my Calculate Library method
 */
public class DoMath 
{

	public static void main(String[] args) {
		System.out.println(Calculate.square(4));
		System.out.println(Calculate.cube(4));
		System.out.println(Calculate.average(3, 2));
		System.out.println(Calculate.average1(3, 5, 6));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadian(90));
		System.out.println(Calculate.discriminant(3, 4, 5));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7));
			}
}