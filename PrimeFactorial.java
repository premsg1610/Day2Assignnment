package com.masai;

public class PrimeFactorial {

	public static void main(String[] args) {
		
		int number = 12;
		
		if(number > 2 & number < 100)
		{
			for(int i=1; i<=number; i++)
			{
				if(number%i == 0)
				{
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}
}
