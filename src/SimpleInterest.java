import java.util.Scanner;
public class SimpleInterest {
	public static void main(String []args){
	Scanner sc=new Scanner (System.in);
		int amt=sc.nextInt();
		float roi=sc.nextFloat();
		int time=sc.nextInt();
		float simple_interest= (amt*roi*time)/100;
		System.out.println((int)simple_interest);
}
}