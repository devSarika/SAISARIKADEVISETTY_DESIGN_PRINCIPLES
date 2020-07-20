package com.epam.Calculator;

public class Calci {

	public double sum(double a,double b) {
		return a+b;
	}
	public double sub(double a,double b) {
		return a-b;
	}
	public double mul(double a,double b) {
		return a*b;
	}
	public double div(double a,double b) {
		
		try {
			return a/b;
		}
		catch(Exception e)
		{
			System.out.println("Divided by zero exception");
		}
		return 0;
	}
}
