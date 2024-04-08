import java.util.Scanner;
class  AreaOfRect{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        int area = l*b;
        System.out.println(area);
    }
}