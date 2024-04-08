import java.util.Scanner;
public class FindEvenSumTillN {
		public static long evenSumTillN(int n)
		 {
		    long sum=0;
			for (long i=2;i<=n;i+=2)
			{
				sum=sum+i;
			}
		    return sum;
		}
		public static void main(String[] args)
	    {
			Scanner sc=new Scanner(System.in);
			int n= sc.nextInt();
		    long sum= evenSumTillN(n);
			System.out.println(sum);
		}
	}
