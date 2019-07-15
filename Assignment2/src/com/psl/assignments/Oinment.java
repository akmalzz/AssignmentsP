package com.psl.assignments;

public class Oinment extends Medicine
{
    Oinment(String name, String address)
    {
        super(name, address);
    }

    @Override
    public void displayLabel()
    {
        System.out.println("Name of Company: "+name+"  Address: "+address);
        System.out.println("For Externel Use only");
    }

}
