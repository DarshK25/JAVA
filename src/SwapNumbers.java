import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER NUMBER 1:");
        int x=sc.nextInt();
        System.out.println("ENTER NUMBER 2:");
        int y=sc.nextInt();
        int temp=x;
        x=y;
        y=temp;
        System.out.println("NUMBER 1: "+x+"\nNUMBER 2: "+y);
	}

}
