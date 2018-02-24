
import java.util.Scanner;
import java.util.*;


public class Guess {

	static Scanner input = new Scanner(System.in);
	
	public static void Guess(String[] args)
	{
		
	System.out.print("Guess A Random Number");
    Scanner inputUser = new Scanner(System.in);
	int answer = (int) Math.floor(Math.random() * 10);
		
	if (answer = input)
	{
		System.out.println("Your guess was " + input + " and that is correct!");
		System.out.println("Your guess was " + inputUser + " and that is correct!");
		
	}
	
	else
	{
		
		System.out.println("Wrong!");
	}
	
	}
}
