package com.psl.assignments;

public class TestMedicine
{
    public static void main(String[] args)
    {
        Medicine[] medicines = new Medicine[10];
        medicines[1] = new Tablet("Cheston Cold","Mankind");
        medicines[2] = new Syrup("Stodal","SBL");
        medicines[3] = new Oinment("Volini","Mankind");

        int i = (int) (Math.random() * 3 +1 );
        //System.out.println(i);
        medicines[i].displayLabel();
    }
}
