package com.psl.assignments;

public class Medicine
{
    String name,address;
    Medicine(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public void displayLabel()
    {
        System.out.println("Name of Company: "+name+"  Address: "+address);
    }
}
