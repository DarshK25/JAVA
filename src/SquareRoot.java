import java.lang.Math;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		float x= sc.nextFloat();
		double y= Math.sqrt(x);
		System.out.println("Square root: "+ y);
	}
}
