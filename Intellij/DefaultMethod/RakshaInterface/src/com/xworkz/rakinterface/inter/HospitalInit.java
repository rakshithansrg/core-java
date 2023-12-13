package com.xworkz.rakinterface.inter;

public class HospitalInit implements Hospital{
    @Override
    public void maintainQueue() {
        System.out.println("Running in maintainQueue");
    }

    @Override
    public void maintainClean() {
        System.out.println("Running in maintain Clean");
    }

    @Override
    public boolean hospitalOPen() {
        System.out.println("Running in hostelpean");
        return false;
    }


    @Override
    public void decipline() {
        System.out.println("Running in Deciplean");
    }
}
