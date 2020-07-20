package com.epam.Calculator;
import java.util.*;

public class CalciTest extends Calci{
	public static void main(String[] args) {
	double input1,input2;
	String operation;
	Calci calc=new Calci();
	Scanner s=new Scanner(System.in);
	
	Character c=new Character('y');
	while(c=='y')
	{
		System.out.print("Enter the First Number:");
		input1=s.nextInt();
		System.out.println();
		System.out.print("Enter the Second Number:");
		input2=s.nextInt();
		System.out.println();
		
		System.out.print("Enter the Operation: + or - or * or / :");
		operation=s.next();
		try
		{
			switch(operation)
			{
			case "+" : System.out.println("The Sum of the above 2 numbers is: "+ calc.sum(input1,input2));break;
					   
			case "-" : System.out.println("The Subtraction of the above 2 numbers is: "+ calc.sub(input1,input2));break;
			
			case "*" : System.out.println("The Multipliation of the above 2 numbers is: "+ calc.mul(input1,input2));break;
		
			case "/" : System.out.println("The Division of the above 2 numbers is: "+ calc.div(input1,input2));
			  
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter correct operation");
		}
		System.out.print("Do you want to continue?(y/n):");
		c=s.next().charAt(0);
	}
	

	}
}
	

