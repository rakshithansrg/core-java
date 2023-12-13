package com.xworkz.Raksha.Palace;

public class MysorePalace extends Palace {
    public MysorePalace()
    {
        System.out.println("Default const in MysorePalace");
    }

    public MysorePalace(String name, String location, int pincode)

    {
        super("BengaluruPalace","Bengaluru",577541);
    }
    @Override
    public void security()
    {
        System.out.println("Method will be override");
    }
}
