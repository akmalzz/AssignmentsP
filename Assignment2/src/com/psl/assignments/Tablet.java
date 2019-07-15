package com.psl.assignments;

public class Tablet extends Medicine
{
    Tablet(String name, String address)
    {
        super(name, address);
    }
    @Override
    public void displayLabel()
    {
        System.out.println("Name of Company: "+name+"  Address: "+address);
        System.out.println("Store in Cool and Dry Place");
    }

}
