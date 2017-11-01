import java.util.*;
public class QuadraticClient {

	
	finish=false	
	if(finish==false){
	Scanner input = new Scanner (System.in);
	System.out.println("Welcome to quadratic equation ax^2 + bx +c");
	System.out.println("Enter value a:");
	double a = input.nextInt()
	System.out.println("Enter value b:");
	double b = input.nextInt()
	System.out.println("Enter value c:");
	double c = input.nextInt();
	
	System.out.println(Quadratic.quadrDescriber(a, b, c));

			
	System.out.print("\n\Are you done?(y/n): ");
	String decide = input.next();
	if ((decide.equals("n"))) {
		System.out.println("\nThank you for using this program!");
		finish = true;
	}
}
	
}
