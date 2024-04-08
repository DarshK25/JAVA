import java.util.*;
import java.io.*;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n= sc.nextInt();
	        int last, even=0,odd=0;
	        while(n!=0){
	            last=n%10;
	            if(last%2==0){
	                even+=last;
	            }
	            else
	            {
	                odd+=last;
	            }
	            n/=10;
	        }
	        System.out.println(even+" "+odd);
	}

}
