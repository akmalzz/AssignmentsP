package com.psl.prob2;

public class Software extends Product 
{
	String OS;
	int memory;
	long licenseKey;
	
	public Software(String OS, int memory, long licenseKey, int productId, String productName, long serialNumber) 
	{
		super(productId, productName, serialNumber);
		this.OS = OS;
		this.memory = memory;
		this.licenseKey = licenseKey;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		super.display();
		System.out.println("OS : "+OS);
		System.out.println("Memory : "+memory);
		System.out.println("License Key : "+licenseKey);
	}
}
