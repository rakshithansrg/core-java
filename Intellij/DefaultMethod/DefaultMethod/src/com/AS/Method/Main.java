package com.AS.Method;

public class Main {
    public static void main(String[] args)
    {
        Guitor gui=new Guitor(1,3000,"wood");
        Guitor gui1=new Guitor(2,4000,"metal");
        Guitor gui2=new Guitor(1,3000,"wood");

        boolean ref=gui.equals(gui2);
        System.out.println("Guitor is equal to Guitor 1 :"+ref);

        System.out.println("===================================");

        WifiDongel wifi=new WifiDongel("intel",200,20);
        WifiDongel wifi1=new WifiDongel("hp",300,40);

        boolean ref1=wifi.equals(wifi1);
        System.out.println("WifiDongel is equal to WifiDongel 1 :"+ref1);

        System.out.println("===================================");

        USBHub usb=new USBHub(3,300,2000);
        USBHub usb1=new USBHub(2,400,6000);
        USBHub usb2=new USBHub(3,300,2000);
        USBHub usb3=new USBHub(2,400,6000);

        boolean ref4=usb.equals(usb1);
        System.out.println("USB and USB1 are Equal :"+ref4);
        System.out.println("------------------------");
        boolean ref5=usb.equals(null);
        System.out.println("USB and NULL are Equal :"+ref4);
        System.out.println("------------------------");
        boolean ref6=usb.equals(usb3);
        System.out.println("USB and USB3 are Equal :"+ref4);
        System.out.println("------------------------");
        boolean ref7=usb1.equals(usb3);
        System.out.println("USB1 and USB3 are Equal :"+ref4);





    }
}
