import java.util.Scanner;
class FahrenheitToCelsiusTable {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int start_fah=sc.nextInt();
		int end_fah=sc.nextInt();
		int step_size=sc.nextInt();
		
		for(int fah=start_fah; fah<=end_fah; fah=fah+step_size )
		{ 
			 int cel=(int)((fah-32)/1.8);
			System.out.println(fah+" "+(int)cel);
		}

	}
}
