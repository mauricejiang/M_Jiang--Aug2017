import java.util.Arrays;
	public class LotsOfCopies {
		public static void main(String[] args) {
			int num = 7;
			String strMain = "APCS";
			int[] arrMain = {1, 2, 3, 4, 5};
			changeMe(num, strMain, arrMain);
			System.out.println(num);
			System.out.println(strMain);
			System.out.println(Arrays.toString(arrMain));
		}
		public static void changeMe (int x, String str, int arr[]) {
			x=8;
			str="10";
			for(int i = 0; i<arr.length; i++) {
				arr[i]++;
			}
			/* a = start;
			 * b = a;
			 * a = newValue;
			 */
			int b = x;
			x = 17;
			System.out.println("b:" + b);
			
			String bStr = str;
			str = "Hi There!";
			System.out.println("bStr:" + bStr);
			
			int[] barr = arr;
			for(int i = );
		}
	}