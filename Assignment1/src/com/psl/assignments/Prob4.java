package com.psl.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob4
{

    static void combinations(String input)
    {
        List<char[]> output = new ArrayList<>();
        char[] arr = input.toCharArray();

        for(int i=0; i<input.length(); i++)
        {
            char[] temp = new char[input.length()];
            for (int j=0; j<input.length(); j++)
            {
                temp[j] = arr[ (i+j) % input.length() ];
            }
            System.out.println(temp);
            output.add(temp);
        }

        //return output.toArray(new String[0]);
    }
//    static void recarrange(String arr, int start, int end, int value)
//    {
//        if(value>0)
//        {
//            for (int i=(start%arr.length()); j< )
//        }
//    }

    public static void main(String[] args)
    {
        String input = "123";
       // System.out.println(input);

        combinations(input);
        //System.out.println(output);


    }
}
