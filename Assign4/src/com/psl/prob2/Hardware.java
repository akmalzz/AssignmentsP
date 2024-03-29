package com.psl.prob2;

public class Hardware extends Product
{
	int length;
	int breadth;
	int capacity;
	String brand;
	boolean powerSupply;
	boolean batteryBackup;
	
	public Hardware(int length, int breadth, int capacity, String brand, boolean powerSupply, boolean batteryBackup, int productId, String productName, long serialNumber) 
	{
		// TODO Auto-generated constructor stub
		super(productId, productName, serialNumber);
		this.length = length;
		this.breadth = breadth;
		this.capacity = capacity;
		this.brand = brand;
		this.powerSupply = powerSupply;
		this.batteryBackup = batteryBackup;
	}
	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Dimensions are "+length+" x "+breadth);
		System.out.println("Capacity : "+capacity);
		System.out.println("Brand : "+brand);
		if(powerSupply)
			System.out.println("Power Supply Required");
		else
			System.out.println("Power Supply Not Required");

		if(batteryBackup)
			System.out.println("Battery Backup is There");
		else
			System.out.println("Battery Backup is Not Required");
	}
	
	
}
