package com.xworkz.Raksha.Palace;

public  abstract class Palace {
    private String name;
    private String location;
    private int pincode;

    public Palace(String name,String location,int pincode)
    {
        this.name=name;
        this.location=location;
        this.pincode=pincode;
        System.out.println("Parameteriazed const");
    }
    public Palace()
    {
        System.out.println("Default const");
    }
    public Palace(String name)
    {
        this.name=name;
        System.out.println("passing 1 parameter const");
    }

    public abstract void security();

    @Override
    public String toString() {
        return "Palace{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
