package demo;

import java.util.Random;
import java.util.Scanner;

class Mastermind
{
	static String[] code = new String[4];				// de te raden code
	static String[] probeersel = new String[4];			// probeersel van user
	static String letter;
	
	static void maakCode()								// genereert 4-letter code
	{
		Random toeval = new Random();
		for (int index = 0; index < 4; index++)
		{
			int getal = toeval.nextInt(6) + 10;			// waarden van 10 - 15
			String hex = Integer.toHexString(getal);	// converteren naar hex
			code[index] = hex;							// opslaan in array
		}		
	}
	
	static void printArray(String[] reeks)
	{
		for (String valPos : reeks)						// print hele array
		{
			System.out.print(valPos +  " ");			// op ��n regel
		}
		System.out.println();
	}
	
	static void vraagProbeersel()							// vraag user om een letter
	{
		Scanner invoer = new Scanner(System.in);
		System.out.println("Geef een code van vier, gescheiden door spaties");
		
		for (int index = 0; index < 4; index++)
		{
			probeersel[index] = invoer.next();
		}
		invoer.close();
	}

	public static void main(String[] args)
	{
		maakCode();
		printArray(code);						// visual check
		vraagProbeersel();
		printArray(probeersel);

/*		int teller = 0;
		
		for (int i = 0; i < 4; i++)
		{
			if (code[i].equalsIgnoreCase(letter))
			{
				teller++;
			}
		}
		
		System.out.println("De letter " + letter + " zit " + teller + " keer in de code.");
*/		
		System.out.println("\n=================");
		System.out.println("Mastermind klaar.");
	}
}
