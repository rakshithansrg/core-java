package com.xworkz.Raksha.PalaceRunner;

import com.xworkz.Raksha.Palace.MysorePalace;
import com.xworkz.Raksha.Palace.Palace;

public class PalaceRunner {
    public static void main(String[] args) {
        Palace palace= new MysorePalace();
       Palace palace1=new MysorePalace("RedFort","Bijapur",577684);
        System.out.println(palace);
        palace.security();
        System.out.println(palace1);
    }
}
