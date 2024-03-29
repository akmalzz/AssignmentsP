package com.psl.jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Client 
{

	public static void main(String[] args) 
	{
		Movie m = new Movie();
		Show s = new Show();
		
		Scanner sc = new Scanner(System.in);

		boolean getOut = false;
		int choice;
		
		while(getOut != true)
		{
			System.out.println("1.Add movie data in movies using file\n2.Display Movies\n3.Display Shows\n4.Add a Movie\n5.Add a Show\n6.Delete From Show table\n7.Update show in the table\n8.See Movies by language\n9.Movies Released Today\n10.Exit");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 case 1:
				 	System.out.println("Enter filename from which you want to add data into the movies database");
					String filename = sc.next();
					m.addMoviesFromFile(filename);
				 break;
				 
			 case 2:
					m.display();
				 
				 break;
				 
			 case 3:
				 	s.display();
				 break;
				 
			 case 4:
				 	System.out.println("Enter Movie name: ");
				 	String mName = sc.next();
				 	System.out.println("Enter Movie Language: ");
				 	String mLang = sc.next();
				 	System.out.println("Enter Movie release date: ");
				 	String mDate = sc.next();
				 	
				 	m.addDataInMovietable(null, mName, mLang, mDate);

				 break;
				 
			 case 5:
				 	System.out.println("Enter Show Time: ");
				 	String sTime = sc.next();
				 	System.out.println("Enter Seats in the show: ");
				 	int mSeats = sc.nextInt();
				 	System.out.println("Enter Movie id: ");
				 	int mMid = sc.nextInt();
				 	
				 	s.addDataInShowtable(0, sTime, mSeats, mMid);

				 break;

			 case 6:
				 	System.out.println("Enter Show Id that you want to delete permanently: ");
				 	int sIdDelete = sc.nextInt();
				 	s.deleteFromShowtable(sIdDelete);

				 break;

			 case 7:
				 	System.out.println("Enter Show Id that you want to update : ");
				 	int sIdUpadte = sc.nextInt();
				 	s.updateFromShowtable(sIdUpadte);

				 break;
			 
			 case 8:
				 	String[] languages = m.getAllLanguages();
				 	
				 	System.out.println("These are the languages in which movies are available");
				 	for(String lang : languages)
				 	{
				 		System.out.println(lang);
				 	}
				 	System.out.println("Enter language to search all the movies:");
				 	String lang = sc.next();
				 	
				 	m.displayMoviesOfLanguage(lang);

				 break;

			 case 9:
				 	Date date = new Date();
				 	String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
				 	//System.out.println(modifiedDate);
				 	System.out.println("Movies today : "+ modifiedDate + " are:");
				 	m.displayTodayMovie(modifiedDate);
				 	
				 break;
			 
			 
			 case 10:
				 System.out.println("Bye !!! See You Soon");
				 getOut = true;
				 break;
				 
			 default:
				 System.out.println("Try Something else");
				 break;
			}
		}
				
		sc.close();

		
	}

}
