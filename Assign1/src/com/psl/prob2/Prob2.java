package com.psl.prob2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

public class Prob2 
{

	Map<String,Integer> populateSData(String filename)
	{
		Map<String,Integer> cityTemp = new HashMap<String, Integer>();
		
		InputStream inputStream = null;
		BufferedReader bufferedReader = null;
		
		try
		{
			inputStream = new FileInputStream(filename);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line = new String();
			String[] data = new String[2];
			
			while((line = bufferedReader.readLine()) != null)
			{
				data = line.split(":");
				cityTemp.put(data[0], Integer.valueOf(data[1]));
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bufferedReader.close();
				inputStream.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		return cityTemp;
	}
	int getTemp(String city,Map<String,Integer> data) throws CityNotFoundException
	{
		
//		Set<String> setOfKeys = data.keySet();
//		
//		for(String key : setOfKeys)
//		{
//			
//		}
		
		Integer temp = data.get(city);
		if(temp==null)
			throw new CityNotFoundException();
		else
			return temp;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Prob2 p = new Prob2();
		String filename = "cityTemp.txt";
		
		Map<String, Integer> cityTemp = p.populateSData(filename);
	
		String city = "Mumbai";
		
		try
		{
			System.out.println("Temperature for "+city+" is :"+p.getTemp(city, cityTemp));
		}
		catch(CityNotFoundException e)
		{
			e.printStackTrace();
		}
	
	}

}
