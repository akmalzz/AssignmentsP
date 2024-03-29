package com.psl.assgn1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EOperations
{
    List<Employee> readEmployeeDetails(String filename)
    {
        List<Employee> eList = new ArrayList<Employee>();

        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        Employee e = null;

        try
        {
            inputStream = new FileInputStream(filename);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            String[] fields = new String[7];
            String[] date = new String[3]; 
            while((line = bufferedReader.readLine()) != null)
            {
                fields = line.split(",");
                e = new Employee();
                e.empid = Integer.valueOf(fields[0]);
                e.empName = fields[1];
                //e.birthdate = fields[2];
                //e.city = fields[3];//No need to read city as per requirement
//                for (String skill : fields[4].split(";"))
//                {
//                    e.skills.add(skill);
//                }
                date = fields[2].split("-");
//                e.birthdate.setYear(Integer.valueOf(date[0]));
//                e.birthdate.setMonth(Integer.valueOf(date[1]));
//                e.birthdate.setDate(Integer.valueOf(date[2]));
//                Date date = new Date();
//                date.
//			 	String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);

                e.birthdate = new SimpleDateFormat("yyyy-MM-dd").parse(fields[2]);
                e.skills = new ArrayList<String>();
                e.skills.addAll(Arrays.asList(fields[4].split(";")));
                //e.stream = fields[5];//No need to read stream as per requirement
                e.project = fields[6];

                eList.add(e);

            }

        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        catch(ParseException ex)
        {
        	ex.printStackTrace();
        }

        finally
        {
            try
            {
             inputStream.close();
             bufferedReader.close();
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }

        return eList;
    }
    
    
    List<Employee> searchEmployees(String skill) throws EmployeeNotFoundException
    {
    	List<Employee> sList = new ArrayList<Employee>();
    	String filename = "Employee.txt";
    	List<Employee> eList = readEmployeeDetails(filename);
//    	boolean skillPresent = false;
    	
    	for(Employee emp : eList)
    	{
    		if(emp.skills.contains(skill))
    			sList.add(emp);
    	}
    	if(sList.isEmpty())
    		throw new EmployeeNotFoundException();
    	
    	return sList;
    }
    void addSkill(int empid,String skill,List<Employee> list)
    {
    	//The structure conflict that's why I am opting to do it soft add
    	//Its is fine to add new skills in file but the problem is file has 7 fields and we are using 5 fields
    	//Then also we can make changes but method prototype contains a list it means we have to do a Soft add
    	//Its return type is also void with list in parameters So We will do a soft add and display it here only
    	boolean found = false;
    	for(Employee emp : list)
    	{
    		if(emp.empid == empid)
    		{
    			emp.skills.add(skill);
    			found = true;
    		}
    	}
    	if(found)
    	{
	    	for(Employee emp : list)
			{
	    		System.out.println(emp);
			}
    	}
    	else
    	{
    		System.out.println("Employee not found with that employee id So Try Again");
    	}
    }
    
    void addNewEmployee(Employee e,List<Employee> emp)
    {
    	emp.add(e);
    	for(Employee employee : emp)
		{
    		System.out.println(employee);
		}
    }
}
