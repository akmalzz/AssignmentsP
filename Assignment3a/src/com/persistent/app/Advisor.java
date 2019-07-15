package com.persistent.app;

public class Advisor
{
    String[] message;

    public Advisor()
    {
        message= new String[]{"Never Say No", "Don't Trust Anyone", "World is being Surfacial", "Start Working on Yourself for yourself", "Take Care"};
    }

    public String getAdvice()
    {
        int i = (int) ((Math.random() * 5) + 1);
        return message[i];
    }
}
