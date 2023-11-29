package com.Xworks.Vehicle.Car;

import com.Xworks.Vehicle.Electric.BMW;

public class BikeUnique {
    public static void main(String[] args) {

        System.out.println("Starting main in BikeUnique");
        Bike bike=new Bike();
        bike.setBike();
        bike.useBike();
        bike.hondaShine();

        BMW bmw=new BMW();
        bmw.useBike();
        bmw.useBMW();

        BikeDuke duke=new BikeDuke();
        duke.displayInfo();


    }

}
