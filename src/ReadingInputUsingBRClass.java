import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingInputUsingBRClass {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader (isr);
		try
		{
		      String input= br.readLine();
		      int n=Integer.parseInt(input);
              System.out.println("Square is: "+n*n);
		}
		catch (IOException ioe)
		{
			System.out.println("!!INPUT ERROR!!");
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
