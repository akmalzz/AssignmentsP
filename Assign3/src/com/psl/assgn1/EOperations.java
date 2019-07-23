package com.psl.assgn1;

import java.io.*;
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
}
