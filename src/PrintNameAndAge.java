import java.util.Scanner;
public class PrintNameAndAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		System.out.println("The name of the person is " + name + " and the age is " + age + ".");
	}

}
