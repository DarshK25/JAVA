import java.util.Scanner;

class Game {
	private int rdmno;

	public Game() {
		this.rdmno = (int) (Math.random() * 100);
	}

	public int getRdmno() {
		return rdmno;
	}

	public int takeUserInput(int UserInput) {
		return UserInput;
	}

	public boolean isCorrectNumber(int Userinp, int CompInp) {
    	if(Userinp != CompInp)
    	{	
    		if(Math.abs(Userinp-CompInp)<=5) {
    		System.out.println("You Are Close!");
            return false;
    	    }
    	    else if(Userinp>=(CompInp+10)) {
    		System.out.println("Your guessed number is way too big.");
    		return false;
    	    }
    	    else if(Userinp<=(CompInp-10)){
    		System.out.println("Your guessed number is way too small.");
    		return false;
    	    }
    	    else if(Userinp>=CompInp && Userinp<=CompInp+10) {
    		System.out.println("Your guessed number is greater than Random Generated Number.");
    		return false;
    	    }
    	    else if(Userinp<=CompInp && Userinp>=CompInp-10){
    		System.out.println("Your guessed number is smaller than Random Generated Number.");
    		return false;
    	    }
    		else {
    			
    	    } 
    	}   
    	else if(Userinp==CompInp)   {
    		System.out.println("YOU GUESSED CORRECT NUMBER.");
    		return true;
    	}
        else {
            System.out.println("INVALID INPUT");
    	}
    	return false;
  }
    	


	int no_of_guesses(int n) {
		{
			n+=1;
			return n;
		}
	}
}

class GuessTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Game player = new Game();
		String playagain;
		do{ 
			 int random = player.getRdmno();
			 System.out.println("\t\t\t\t\t\tWELCOME TO GUESS A NUMBER GAME:\n\n");
		     System.out.print("A Random Number Has been Generated.You have 10 guesses.\nGuess a Number from 0 to 100: ");
	         int Userinput = player.takeUserInput(sc.nextInt());
    	     int n = 0;
		     boolean result;
		     do {
			    System.out.println("Your Input: " + Userinput);
		 	    result = player.isCorrectNumber(Userinput, random);
		    	if (result == true) {
				System.out.println("Number of Guesses Required: " + (n+1));
				System.out.println("\n\t\t\t\t\t\t\t!!YOU WON!!\t\t\t\t");
				break;
		     	}
			    n = player.no_of_guesses(n);
	    		System.out.println("Number of Guesses Left: " + (9 - n));
	    		System.out.println();
     			System.out.print("Guess Again: ");
	    		Userinput = player.takeUserInput(sc.nextInt());
	    			    	 } while (n < 9 );
		     if (result == false) {
			 System.out.println("Random generated number: " + random);
			 System.out.println("YOU LOST :((");
		     }
		     System.out.println("Do you want to play again? (y/n):");
		     playagain=sc.next();
	      }while(playagain.equals("y"));
		sc.close();
	}
}