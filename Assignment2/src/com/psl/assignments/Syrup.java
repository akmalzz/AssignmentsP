package com.psl.assignments;

public class Syrup extends Medicine
{
    Syrup(String name, String address)
    {
        super(name, address);
    }

    @Override
    public void displayLabel()
    {
        System.out.println("Name of Company: "+name+"  Address: "+address);
        System.out.println("Keep Away from Sunlight.Inflamable!!! Just Kidding ;) ");
    }

}
