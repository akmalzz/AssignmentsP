package com.psl.assignments;

public class Assignment1m
{
    static void combinations(String str, int start, int end)
    {
        if(start==end)
            System.out.println(str);
        else
        {
            for(int i = start; i<=end; i++)
            {
                str = swap(str, start, i);
                combinations(str, start+1, end);
                str = swap(str, start, i);
            }
        }
    }
    static String swap(String str, int i, int j)
    {
        char[] strChar = str.toCharArray();
        char temp = strChar[i];
        strChar[i] = strChar[j];
        strChar[j] = temp;

        return String.valueOf(strChar);
    }
    public static void main(String[] args)
    {
        String str = "123";
        int n = str.length();
        combinations(str, 0, n-1);

    }
}
