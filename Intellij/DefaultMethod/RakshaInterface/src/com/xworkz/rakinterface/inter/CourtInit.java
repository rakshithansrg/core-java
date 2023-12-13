package com.xworkz.rakinterface.inter;

public class CourtInit implements Court{
    @Override
    public void citizenOfIndia() {
        System.out.println("Running in citizen Of India");
    }

    @Override
    public void years() {
        System.out.println("Running in years");

    }

    @Override
    public void reviewPetition() {
        System.out.println("Running in Review Petition");
    }

    @Override
    public void curativePetition() {
        System.out.println("Running in Curative Petiotion");
    }
}
