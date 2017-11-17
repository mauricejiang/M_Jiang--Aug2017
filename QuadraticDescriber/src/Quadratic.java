public class Quadratic {
 public static double discriminant(double a, double b, double c) {
		return ((b * b)-4 * a * c);
	}
 
  public static int square(int a) {
		return a * a;
	}
  
  public static double round2(double num){
        if(num < 0){
            num *= -1;
            if(num * 1000 % 10 < 5){
                num = (num * 1000 - num * 1000 % 10) / 1000;
            }
            else{
                num = (10 - num * 1000 % 10 + num * 1000) / 1000;
            }
            num *= -1;
            return num;
        }
        else{
            if(num * 1000 % 10 < 5){
                return (num * 1000 - num * 1000 % 10) / 1000;
            }
            else{
                return (10 - num * 1000 % 10 + num * 1000) / 1000;
            }
        }
    }
  	public static double sqrt(double num) {
		  double answer = num;
		  double num1 = num;
		  double x = answer;
		if (num < 0) {
			throw new IllegalArgumentException("You can't square root a negative number.");
		}
		else if (num == 0) {
			x = 0;
		}
		else if (num > 0){
			num1 = num / 2;
			x = (num - (num / num1)) / 2;
		} while ((num1 - x) != 0);
			return round2(x);
		
		}
  	
  	
  	
  
      double postive = round2((-b + sqrt(discriminant)) / 2 * a);
	    double negative = round2((-b - sqrt(discriminant)) / 2 * a);
}
    public static double x-intercept(double a, double b){
      double xvalue = - b / (2*a);
      return (xvalue + ", 0");
}
    public static double y-intercept(double a, double b, double c){
      double yvalue = (square(x-intercept)) + b * x-intercept + c;
      return ("0, " + yvalue);
}
