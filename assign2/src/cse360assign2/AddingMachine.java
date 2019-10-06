/**
 * Author: Arif Tse
 * Class ID: CSE 360
 * Assignment 2
 * 
 * This assignment's objective is to make a calculator that can perform basic math operations.
 * We will then commit this project to Github.
 */


package cse360assign2;


/**
 * The AddingMachine class will hold a private integer total
 * to keep track of the total value after computing operations as well
 * as the AddingMachine constructor. It will also contain the methods
 * getTotal(), add(int), subtract(int), toString() and clear().
 */
public class AddingMachine 
{

	private int total;
	private String equationString = "0";
	
	/**
	 * Constructor of our class that will help keep track
	 * of our total after computation.
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * The getTotal() method will return our current total
	 * value after computations.
	 * 
	 * @return		our total value after computations.
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * The add(value) method will add our parameter value
	 * to our total.
	 * 
	 * @param value The integer we want added to the total.
	 */
	public void add (int value) 
	{
		total = total + value;
		equationString = equationString + " + " + Integer.toString(value) ;
	}
	
	/**
	 * The subtract(value) method will subtract our parameter value from our total.
	 * 
	 * @param value The integer we want subtracted from the total.
	 */
	public void subtract (int value) 
	{
		total = total - value;
		equationString = equationString + " - " + Integer.toString(value) ;
	}
	
	/**
	 * The toString() method will keep track of all the computations
	 * and print out the String equation corresponding to the computations made.
	 * 
	 * @return 		An equation string corresponding to the called computation methods.
	 */
	public String toString () 
	{
		return equationString;
	}
	
	/**
	 *	The clear() method will reset the total back to 0 and also
	 *	reset the recorded computation methods to take in a new computational problem. 
	 */
	public void clear() 
	{
		total = 0;
		equationString = "0";
	}
	

}

