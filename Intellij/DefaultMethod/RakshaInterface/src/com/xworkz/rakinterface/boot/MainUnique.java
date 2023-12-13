package com.xworkz.rakinterface.boot;

import com.xworkz.rakinterface.inter.*;

public class MainUnique {
    public static void main(String[] args) {
        HospitalInit hosp=new HospitalInit();
        hosp.maintainClean();
        hosp.hospitalOPen();
        hosp.maintainQueue();
        hosp.decipline();

        String name= Hospital.name;
        System.out.println("Name :"+name);
        int rooms=Hospital.rooms;
        System.out.println("Rooms :"+rooms);

        System.out.println("=======================");

        Hostelinit hostelinit=new Hostelinit();
        hostelinit.decipline();
        hostelinit.plasticbagssuck();
        hostelinit.timingsrules();
        hostelinit.noparties();

        String name1= Hostel.name1;
        System.out.println("Name :"+name1);
        int students=Hostel.students;
        System.out.println("Students :"+students);

        System.out.println("==========================");

        Templeinit templeinit=new Templeinit();
        templeinit.opentimings();
        templeinit.closetimings();
        templeinit.noofqueues();
        templeinit.prasadhatimings();

        String name2=Temple.name2;
        System.out.println("Name2 :"+name2);
        int noofdoors=Temple.noofdoors;
        System.out.println("noofdoors :"+noofdoors);

        System.out.println("==========================");

        Court court=new CourtInit();
        court.citizenOfIndia();
        court.curativePetition();
        court.years();;
        court.reviewPetition();

        int lawyers=Court.noOfLawyers;
        System.out.println("No of Lawyers :"+lawyers);

        String name3=Court.judgeName;
        System.out.println("Judge name :"+name3);

        System.out.println("==========================");

        Forest forest=new ForestInit();
        forest.clean();
        forest.drinkPlentyOfWater();
        forest.seekshade();;
        forest.Usesunscreen();

        String name4=Forest.name;
        System.out.println("Forest name :"+name4);
        int num=Forest.noOfAnimals;
        System.out.println("Number of Animals :"+num);


    }
}
