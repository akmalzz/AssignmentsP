package com.psl.prob2;

public class Client 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Product[] p = new Product[10];
		p[0] = new Software("Linux", 4, 2547896347l, 45578, "Tally", 4457878965l);
		p[0].display();
		p[1] = new Hardware(10, 20, 14, "Dell", true, false, 58962, "Desktop", 478965454l);
		p[1].display();
	}

}
