package Exercise;

import java.util.Scanner;

public class Mathematical_Operation 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter Number2: ");
		int num2 = scan.nextInt();
		System.out.println("Addition of Given Number is :"+(num1+num2));
		
		System.out.print("Enter Number1: ");
		int num3 = scan.nextInt();
		System.out.print("Enter Number2: ");
		int num4 = scan.nextInt();
		System.out.println("Subtraction of Given Number is :"+(num1-num2));
		
		System.out.print("Enter Number1: ");
		int num5 = scan.nextInt();
		System.out.print("Enter Number2: ");
		int num6 = scan.nextInt();
		System.out.println("Multiply of Given Number is :"+(num1*num2));
		
		System.out.print("Enter Number1: ");
		int num7 = scan.nextInt();
		System.out.print("Enter Number2: ");
		int num8 = scan.nextInt();
		System.out.println("Divide of Given Number is :"+(num1/num2));
		
		System.out.print("Enter Number1: ");
		int num9 = scan.nextInt();
		System.out.print("Enter Number2: ");
		int num10 = scan.nextInt();
		System.out.println("Mod of Given Number is :"+(num1%num2));
	}
}
