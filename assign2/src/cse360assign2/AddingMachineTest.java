package cse360assign2;

public class AddingMachineTest 
{
	public static void main(String[] args)
	{
		AddingMachine equation = new AddingMachine();
		equation.add(3);
		equation.subtract(8);
		equation.add(3);
		String test = equation.toString();
		int total = equation.getTotal();
		System.out.println(test);
		System.out.println(total);
		equation.clear();
		equation.subtract(1);
		equation.subtract(2);
		test = equation.toString();
		total = equation.getTotal();
		System.out.println(test);
		System.out.println(total);
	}
}
