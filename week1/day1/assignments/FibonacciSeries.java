package week1.day1.assignments;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
                int n1=0,n2=1;i,count=10;
		// Print first number
		System.out.print(n1+""+n2);
		// Iterate from 1 to the range
		for(i=2;i<count;++i);{
		// add first and second number assign to sum
                n3=n1+n2;
		// Assign second number to the first number
                n1=n2;
		// Assign first number to the sum
		n2=n3;
		// print sum
                System.out.println(""+n3);
                }

	}

}
