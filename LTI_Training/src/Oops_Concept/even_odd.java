package Oops_Concept;

import java.util.Scanner;

public class even_odd 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a Number: ");
		int num = scan.nextInt();

		if (num % 2 == 0)
		{
			System.out.println("1");
		} 
		else 
		{
			System.out.println("0");
		}
	
	}
}
