import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingInputUsingBRClass {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);// InputStreamReader is initialized with System.in,
																	// which represents the standard input stream
		// (typically the keyboard).
		BufferedReader br = new BufferedReader(isr);// BufferedReader is initialized with the InputStreamReader to read
													// from the input stream.
		try {
			String input = br.readLine();
			int n = Integer.parseInt(input);// This line parses the input string into an integer using the parseInt()
											// method of the Integer class.This line parses the input string into an
											// integer using the parseInt() method of the Integer class.
			System.out.println("Square is: " + n * n);
		} catch (IOException ioe) {
			System.out.println("!!INPUT ERROR!!");
		}
		try {
			br.close();// This line closes the BufferedReader to release system resources
		} catch (IOException e) {
			e.printStackTrace();
			/*
			 * Prints Exception Information: When you call printStackTrace() on an exception
			 * object, it prints information about the exception to the console. This
			 * includes the class name, message (if any), and the stack trace. Stack Trace:
			 * The stack trace is a list of methods that were called at the point where the
			 * exception was thrown. It provides a trace of the program execution path up to
			 * the point where the exception occurred. Each method in the trace is
			 * represented by its class name, method name, and line number. Helps Debugging:
			 * The stack trace is crucial for debugging because it helps you understand the
			 * sequence of method calls leading up to the exception. By analyzing the stack
			 * trace, you can identify where the problem occurred in your code and trace
			 * back to its root cause.
			 */
		}
	}

}
