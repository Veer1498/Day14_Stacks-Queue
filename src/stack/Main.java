package stack;
import java.util.Scanner;
/**
 * @author singa
 *
 */

public class Main {
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Created an Object Stack
		 * Took a Scanner to Select Which Method to Perform
		 * Calling Methods from Stacks Class and perform.
		 */
		// TODO Auto-generated method stub
		System.out.println("Welcome to Stacks & Queue Program");
		Stacks stack = new Stacks();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n1.Add Elements in Stack \n2.Peak and Pop Elements in Stack");
		int n = sc.nextInt();
		
		switch(n) {
		case 1 :
			stack.push();
			break;
		case 2 :
			stack.Peak();
			stack.pop();
			break;
		}

	}

}
