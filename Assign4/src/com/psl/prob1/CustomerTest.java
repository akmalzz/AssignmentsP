package com.psl.prob1;

public class CustomerTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Customer c1 = new Customer(1, "Akmal", 5475236894l, 2547896314l, 2546987732l, "RStreet", "Akola", "Maharashtra", 444444);
		Customer c2 = new Customer(2, "Prasad", 2368547594l, 9631254784l, 7254698732l, "Sahkar Colony", "Pune", "Maharashtra", 544544);
		
		
		c1.printPhoneNumbers();
		c1.printShippingAddress();
		System.out.println("After Updating values");
		c1.setPhoneNumbers(45455554544l, 87656114464l, 2387561489l);
		c1.setPrintingAddress("JStreet", "Akola", "Maharashtra", 411589);
		c1.printPhoneNumbers();
		c1.printShippingAddress();
		
		System.out.println("All Details");
		c1.printAll();

	System.out.println("\n\n\n\nObject2\n\n");
		c2.printPhoneNumbers();
		c2.printShippingAddress();
		System.out.println("After Updating values");
		c2.setPhoneNumbers(5454454544l, 14468765614l, 2489387561l);
		c2.setPrintingAddress("St Jseph Street", "Panji", "Goa", 4521789);
		c2.printPhoneNumbers();
		c2.printShippingAddress();
		
		System.out.println("All Details");
		c2.printAll();

	
	}

}
