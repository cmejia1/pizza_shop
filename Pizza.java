/* chapter 3 extra project
   Starting pizza price is $12.99
   toppings cost .50 cents each */

public class Pizza 
{
	// instance variables for the Pizza class
	private String custName;
	private double price;
	private int numToppings;

	// new constructor method for the Pizza class
	public Pizza()
	{
		custName = "Customer";
		price = 12.99;
		numToppings = 0;
	} // end of constructor method

	// basic static method for this class
	public static void intro()
	{
		System.out.println("**********************************");
		System.out.println("Welcome to the digital pizza shop!");
		System.out.println("**********************************");
	} // end of into() method

	// mutator (setter) methods for the Pizza class
	public void enterName(String name)
	{
		custName = name;
	} // end of enterName() method

	public void addToppings(int num)
	{
		numToppings = num;
	} // end of addToppings() method

	public void calcPrice()
	{
		price = price + (numToppings * .50);
	} // end of calcPrice() method

	// accessor (getter) methods for the Pizza class
	public void summary()
	{
		System.out.println();
		System.out.println("Thank you, " + custName);
		System.out.println("A pizza with " + numToppings + " topping(s) will cost: $" + price);
	} // end of summary() method

} // end of class