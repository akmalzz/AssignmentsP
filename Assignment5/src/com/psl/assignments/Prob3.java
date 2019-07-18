package com.psl.assignments;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Prob3
{
    List<Name> names = new Vector<Name>();

    private void add(String fname, String lname)
    {
        names.add(new Name(fname, lname));
    }

    private void display()
    {
        for(Name name : names)
            System.out.println("Name: "+ name.firstname +" "+ name.lastname);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Prob3 p = new Prob3();

        boolean getOut = false;
        int choice;

        while(getOut != true)
        {
            System.out.println("1.Enter Data\n2.Display\n3.Exit");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter Firstname:");
                    String firstname = sc.next();

                    System.out.println("Enter Lastname:");
                    String lastname = sc.next();

                    p.add(firstname, lastname);

                    break;

                case 2:
                    p.display();
                    break;

                case 3:
                    getOut = true;
                    System.out.println("See you soon");
                    break;

                default:
                    System.out.println("Try Something else");
                    break;
            }
        }

        sc.close();

    }
}
