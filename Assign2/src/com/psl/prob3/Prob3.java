package com.psl.prob3;

public class Prob3 
{
	static double calInterest(int amt)
	{
		double intrest = 0.0;
		
		if(amt>0 && amt <= 1000)
			intrest = amt * 4;
		else if(amt>0 && amt <= 50000)
			intrest = amt * 4.5;
		else if(amt>0 && amt>50000)
			intrest = amt * 5;
		
		return intrest;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Intrest on amount : 800" + calInterest(800));
		System.out.println("Intrest on amount : 800" + calInterest(2000));
		System.out.println("Intrest on amount : 800" + calInterest(70000));
		System.out.println("Intrest on amount : 800" + calInterest(5454));
		
	}

}
