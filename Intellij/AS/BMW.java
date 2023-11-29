package com.Xworks.Vehicle.Electric;
import com.Xworks.Vehicle.Car.Bike;

public class BMW extends Bike{

    public BMW()
    {
        System.out.println("no args");
    }
    public void useBMW()
    {

        System.out.println("method BMW");

    }
    @Override
    public void useBike()
    {
        System.out.println("method override");

    }

}
