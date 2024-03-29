package com.psl.prob1;

public class Customer 
{
	int id;
	String name;
	long homePhone, cellPhone, workPhone;
	String street, city, state;
	int zip;

	public Customer(int id,	String name, long homePhone, long cellPhone, long workPhone, String street, String city, String state,	int zip) 
	{
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	void printPhoneNumbers()
	{
		System.out.println("Home Phone : "+ homePhone);
		System.out.println("Cell Phone : "+ cellPhone);
		System.out.println("Work Phone : "+ workPhone);
	}
	void printShippingAddress()
	{
		System.out.println("Address : "+street+", "+city+", "+state+" " + zip);
	}
	void setPrintingAddress(String street, String city, String state, int zip)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;		
	}
	void setPhoneNumbers(long homePhone, long cellPhone, long workPhone)
	{
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;		
	}
	void printAll()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		printPhoneNumbers();
		printShippingAddress();
	}
}
