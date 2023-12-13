package com.xworkz.rakinterface.inter;

public class ForestInit implements Forest{
    @Override
    public void Usesunscreen() {
        System.out.println("Running in Use sun Screen");
    }

    @Override
    public void seekshade() {
        System.out.println("Running seek shade");
    }

    @Override
    public void drinkPlentyOfWater() {
        System.out.println("Running in Drink plenty of water");
    }

    @Override
    public void clean() {
        System.out.println("Running in Clean");
    }
}
