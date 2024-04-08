import java.util.Scanner;
class Exponentiation {
    public static int power(int x, int n)
    {
        if(n==0)
        return 1;
        else
        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int x= sc.nextInt();
        int n=sc.nextInt();
        int y=power(x,n);
        System.out.println(y);
    }
}