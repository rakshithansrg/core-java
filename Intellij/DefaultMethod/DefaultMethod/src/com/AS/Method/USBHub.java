package com.AS.Method;

public class USBHub {
   public int totalPort;
   public int transferRate;
   public int batteryRequired;

   public USBHub(int totalPort,int transferRate,int batteryRequired)
   {
       this.batteryRequired=batteryRequired;
       this.totalPort=totalPort;
       this.transferRate=transferRate;

       System.out.println("int ,int,int :"+batteryRequired+","+totalPort+","+transferRate);
   }

    @Override
    public boolean equals(Object obj) {
        USBHub leftSide=this;

        if(obj!=null)
        {
            if(obj instanceof Object)
            {
                USBHub reightSide=(USBHub) obj;
                if(leftSide.totalPort==reightSide.totalPort && leftSide.batteryRequired==reightSide.batteryRequired && leftSide.transferRate==reightSide.transferRate)
                {
                    System.out.println("Properties are Equal");
                    return true;
                }
                else
                {
                    System.out.println("properties are not same");
                }

            }
            else
            {
                System.err.println("Not same");
            }
        }
        else
        {
            System.err.println("obj is null");
        }
        return false;
    }
}


