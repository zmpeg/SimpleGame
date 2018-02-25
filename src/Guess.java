
import java.util.Scanner;
import java.util.*;

public class Guess {

	public static void main(String[] args) {

		System.out.print("Guess A Random Number from 1 - 10");
    Scanner inputUser = new Scanner(System.in);
		
		int answer = (int) Math.floor(Math.random() * 10);
	
		if(answer == inputUser.nextInt()) // this is not working i think it may be a converions issue
		{
			System.out.println("Your guess was " + inputUser + " and that is correct!");
		}
		else
		{
			System.out.println("Wrong, the number was " + answer);
		}
	}

}
