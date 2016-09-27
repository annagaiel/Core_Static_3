package three;

public class Test {
/**
 * Output must be one of the following:
 *	a. Compiler error.
 *	b. Will throw a NoSuchMethod error at runtime.
 *	c. It will compile and run printing out "10“
 *	d. It will run with no output.
 *	e. It will run and print "10" and then crash with an error
 *
 * Answer: 
 * a. Compiler error. It outputs Error: Main method not found in class three.Test, please define the main method as:
   	  public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
 * c. When main method was added, static block was executed. 
 *    It called static void print method to print "10“ and exited the program.
 * 	  The main method is never run as System exited on static void print method.
 * 
 * @param args
 */

/**
 * This static block will be executed at the time of class loading for the very first time in JVM.
 * It is executed before the main method.
 */
	static{
		print(10);
	}
	
	static void print(int x) {
		System.out.println(x);
		System.exit(0);
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
	}
}
