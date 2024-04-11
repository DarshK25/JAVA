import java.util.*;

class Factorial {
  public static void main(String args[])
	 {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n<0)
        {
            System.out.println("error");
        }
        else if(n==0)
        {
            System.out.println("1");
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
    }
}
/* alternate method 
    public static void fact(int x)
{
    if(x=0 || x=1) return 1;
    else return x*fact(x-1);
}
public static void main(String args[])
{
 Scanner sc= new Scanner (System.in);
 int x= sc.nextInt();
 int y=fact(x);        //System.out.println(fact(x)); 
 System.out.println(y);
}
*/