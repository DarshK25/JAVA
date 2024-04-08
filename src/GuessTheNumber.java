import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randNum = sc.nextInt();
        int correctNum= (int)(Math.random()*100)+1;
        System.out.println(randNum+" "+correctNum);
    }
}