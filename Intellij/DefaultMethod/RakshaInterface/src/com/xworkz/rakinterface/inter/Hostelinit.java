package com.xworkz.rakinterface.inter;

public class Hostelinit implements Hostel {


    @Override
    public void timing() {
        System.out.println("timings within 8");
    }

    @Override
    public void decipline() {
        System.out.println("good desciplane mainteen in hostel");

    }

    @Override
    public void plasticbagssuck() {
        System.out.println("dont use plasticbagsucks");

    }

    @Override
    public void timingsrules() {
        System.out.println("timing rules must be followed");

    }

    @Override
    public boolean noparties() {
        return false;
    }
}
